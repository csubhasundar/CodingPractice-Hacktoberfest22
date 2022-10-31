
//Creating an object of file
//File obj = new File("filename.txt");

//Creating a file
/*
try{
obj.createNewFile();
}
catch(Exception e)
{
sout(e)
}
 */

//Writing a file
/*
try{
FileWriter fileWriter = new FileWriter("filename.txt");
fileWriter.write(" your text");
fileWriter.close();
}
catch(Exception e){
sout(e);
}
 */

//Reading a file
/*
try{
Scanner sc = new Scanner(obj);
while(sc.hasNextLine()){
String line = sc.nextLine();
sout(line);
}
catch(Exception e){
sout(e);
}
 */

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

//Deleting a file
/*
if(obj.delete()){
sout(obj.getName());
}
else{
sout(some error occured)
}
 */
public class File_Handling {
    public static void main(String[] args) {
        File myFile = new File("File_Handling.txt");

        //Creating
        try {
            myFile.createNewFile();
        }catch (Exception e){
            System.out.println(e);
        }

        //Writing
        try{
            FileWriter writing = new FileWriter("File_Handling.txt");
            writing.write("This is my first file \nAnd I wrote it\n\t\t-Ashutosh");
            writing.close();
        }catch (Exception e){
            System.out.println(e);
        }

        //Reading
        try{
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println(e);
        }

        //deleting
        if(myFile.delete()){
            System.out.println("I have deleted successfully"+ myFile.getName());
        }
        else{
            System.out.println("Some error occured");
        }
    }
}
