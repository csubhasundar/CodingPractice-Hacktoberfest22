package main
import (
	"fmt"
	"net/http"
	"html/template"
)
func initf(w http.ResponseWriter,r *http.Request){
	fmt.Fprintf(w,"Please enter your details")
}
func exec(w http.ResponseWriter,r *http.Request){
	if r.Method=="GET"{
		t,_:=template.ParseFiles("index.gtpl")
		t.Execute(w,nil)
	}else{
	
		r.ParseForm()
		fmt.Fprintf(w,"text : ",r.Form["body"])
	}

}
func main(){
	http.HandleFunc("/",initf)
	http.HandleFunc("/markdown",exec)
	http.ListenAndServe(":8080",nil)
}
