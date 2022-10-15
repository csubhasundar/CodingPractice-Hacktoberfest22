const express=require('express')
const app=express()
const server=require('http').createServer(app)
const io=require('socket.io')(server)
const sql=require('mysql')
const bodyparser=require('body-parser')
const session=require('express-session')
const cookie=require('cookie-parser')
const fs=require('fs')
const bcrypt=require('bcrypt')
const upl=require('multer')()
const path=require('path')
app.set('views','./views')
app.set('view engine','pug')
app.use(express.json())
app.use(bodyparser.urlencoded({extended:true}))
app.use(cookie())
app.use(express.static(path.join(__dirname,'/public')))
app.use(session({
	secret:'Admin@fedora35',
	resave:true,
	saveUninitialized:true
}))
let con = sql.createConnection({
	host:'localhost',
	user:'root',
	password:'localmux@34',
	database:'lambda'
})
con.connect(err=>{
	if (err)
		console.log(err)
})
app.get('/',(req,res)=>{
	res.sendFile(__dirname+'/public/login.html')
})
app.post('/register',(req,res)=>{
		let uname = req.body.txt
		let email = req.body.email
		let passwd = req.body.pswd
		let valid = 'SELECT username from reguser where email='+'"'+email+'"'
		console.log(valid)
		con.query(valid,(err,result)=>{
			if (err)
				throw err
			if (Object.keys(result).length===0){
					let unid = email.split("@")[0]
					console.log(unid)
					bcrypt.hash(passwd,10).then(passhash=>{
					let query = 'INSERT INTO reguser VALUES('+'"'+uname+'"'+','+'"'+email+'"'+','+'"'+passhash+'"'+','+'"'+unid+'"'+')'
					console.log(passhash)
					con.query(query,(err,result)=>{
						if (err){
							console.log('failed to register')
						}else{
							let USER = {
									name:`${uname}`,
									email:`${email}`,
									passwd:`${passwd}`
							}
							res.cookie("userdata",USER)
							res.redirect('/index')
						}
						})
					})
			}else{
				res.type('text/html')
				res.send('<h1>user already resgistered</h1>')
			}
		})
		
})
app.post('/signin',(req,res)=>{	
		let email = req.body.email
		let passwd = req.body.pswd
		let valid = 'SELECT username from reguser where email='+'"'+email+'"'
		console.log(valid)
		con.query(valid,(err,result)=>{
			if (err)
				console.log(err)
			if (Object.keys(result).length!=0){
				let map = 'SELECT username,password from reguser where email='+'"'+email+'"'
				con.query(map,(error,db)=>{
					if (error)
						throw error
					bcrypt.compare(passwd,db[0].password,(errpss,respass)=>{
						console.log(db[0].password,respass)
						if (respass==true){
								let USER = {
									name:`${db.username}`,
									email:`${email}`,
									passwd:`${passwd}`
								}
								res.cookie("userdata",USER)
								res.redirect('/index')
						}else{
							res.redirect('/')
						}
					})
				})
			}else{
				res.redirect('/')
			}
		})
})
app.get('/index',(req,res)=>{
		if (req.cookies.userdata!=null){
			res.sendFile(path.join(__dirname+'/public/main.html'))
		} 
})
app.get('/userinfo',(req,res)=>{
		if (req.cookies.userdata!=null){
			let query='SELECT * FROM reguser where email='+'"'+req.cookies.userdata.email+'"'
			console.log(query)
			con.query(query,(err,result)=>{
				if (err)
					throw err
				console.log(result)
				res.type('application/json')
				res.send(JSON.stringify(result))
			})
		}else{
			res.redirect('/')
		}
})
app.get('/search',(req,res)=>{
	if (req.cookies.userdata!=null){
		console.log(req.query.umail)
		let sem=req.query.umail
		let query='SELECT * FROM reguser WHERE email='+'"'+sem+'"'
		con.query(query,(err,result)=>{
			if (err)
				throw err
			if (Object.keys(result).length==1){
				res.type('application/json')
				res.send(result)
			}
		})
	}
})

io.on('connection',(socket)=>{
	console.log('connected with localhost:7600 with id=',socket.handshake.auth.user)
	socket.join(socket.handshake.auth.user)
	socket.on('client-to-server',(ob)=>{
		console.log(ob)
		let from={
			content:ob.content,
			f:socket.handshake.auth.user
		}
		socket.to(ob.to).emit('server-to-client',from)
	})
})


const PORT=7600
server.listen(PORT,()=>{console.log('server started on port',`${PORT}`)})

