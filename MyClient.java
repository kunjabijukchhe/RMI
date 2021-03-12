import java.rmi.*;
import java.util.Scanner;

public class MyClient{
    public MyClient(){

    }
    public static void main(String args[]) throws RemoteException{
        int radius;
        try{
            Scanner input= new Scanner(System.in);
            System.out.print("Enter the radius of the circle: ");
            radius=input.nextInt();
    
            PerimeterCircle c=(PerimeterCircle)Naming.lookup("Circle://localhost:5000/circle");
            System.out.println("The Perimeter of circle is "+c.Perimeter(radius));
        }
        catch(Exception e){
            System.out.println(e);
        }


    }
    

}
