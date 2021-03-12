// import java.rmi.*;
// import java.rmi.server.*;
// public class PerimeterCircleRemote extends UnicastRemoteObject implements PerimeterCircle {
//     public  PerimeterCircleRemote() throws RemoteException{
//         super();
//     }
//     public double Perimeter(int radius)throws RemoteException{
//         {
//             double pi = 3.14;
//             return 2* pi * radius;
//         }    
// }
// }

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class CTCPClient {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println("Error");
            return;
        }
        try (var socket = new Socket(args[0], 59898)) {
            System.out.println("Enter lines of String:");
            var scanner = new Scanner(System.in);
            var in = new Scanner(socket.getInputStream());
            var out = new PrintWriter(socket.getOutputStream(), true);
            while (scanner.hasNextLine()) {
                out.println(scanner.nextLine());
                System.out.println(in.nextLine());
            }
        }
    }
}