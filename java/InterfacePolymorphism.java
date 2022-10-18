
interface camera{
    void takeSnap();
    private void cameraOpen(){
        System.out.println("Camera is Opening");
    }
    default void cameraGreet(){
        cameraOpen();
        System.out.println("Hello Camera");
    }
}
interface user{
    String[] users();
    default void Admin(String name){
        System.out.println("Admin of the mobile is: " +name);
    }
}
class cellphonee{
    public void call(){
        System.out.println("calling...");
    }
}
class smartphonee extends cellphonee implements camera , user{
    public void music(){
        System.out.println("Playing music");
    }
    public void takeSnap(){
        System.out.println("Taking snap...");
    }
    public  String[] users() {
        System.out.println("Showing the name of the users: ");
        String [] user = {"Ashu" , "roni"};
        return user;
    }
}
public class InterfacePolymorphism {
    public static void main(String[] args) {
        System.out.println("Calling methods using smartphone object- ");
        smartphonee sp = new smartphonee();
        System.out.println("1 . Interface class camera");
        sp.takeSnap();
        sp.cameraGreet();
        System.out.println("2. Interface class user");
        sp.users();
        sp.Admin("Ashutosh");
        System.out.println("3. Parent class cellphone");
        sp.call();
        System.out.println("4. Child class smartphone");
        sp.music();

        System.out.println("Calling only methods of interface class camera using its object");
        camera c = new smartphonee();
        c.takeSnap();
        c.cameraGreet();

        System.out.println("Calling only methods of interface class user using its object");
        user u = new smartphonee();
        u.Admin("Ashutosh");
        u.users();

        System.out.println("Calling only methods of parent class using its object");
        cellphonee cp =new smartphonee();
        cp.call();
    }
}
