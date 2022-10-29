import java.util.*;

class constructorOverloading{
    String language;

    constructorOverloading(){
        language = "Java";

    } 

    constructorOverloading(String lang){
        language = lang;

    }

public void getValue(){
        System.out.println(this.language);
    }

    public static void main(String args[]){
        constructorOverloading obj1 = new constructorOverloading();
        constructorOverloading obj2 = new constructorOverloading("Python");

        obj1.getValue();
        obj2.getValue();
    }
}

    
