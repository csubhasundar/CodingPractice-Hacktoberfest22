
/*
class<parameter1 ,parameter2>{
parameter1 obj;
parameter2 obj;
constructor(parameter1 obj , parameter2 obj){
this.obj = obj;
this.obj =obj;
}
 */
//classname <Type> obj = new classname <Type> ();
class myGenerics<T1 , T2>{
    int value;
    private T1 t1;
   private T2 t2;
    myGenerics(int value , T1 t1 , T2 t2){
        this.value = value;
        this.t1 = t1;
        this.t2 = t2;
    }
    public void display(){
        System.out.println("The value is: "+value);
    }
    public T1 getT1(){
        return t1;
    }
    public T2 getT2(){
        return  t2;
    }
}
 class Generics {
    public static void main(String[] args) {
        myGenerics<String , Integer> g1 = new myGenerics<>(20 , "Ashutosh", 1);
        g1.display();
        String str = g1.getT1();
       int in =  g1.getT2();
        System.out.println(str + in);
    }
}
