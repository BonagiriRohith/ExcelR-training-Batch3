

import java.util.*;

public class Demo008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username,pass;
        do{
            System.out.println("Hello Mallareddy Unversity, Please Login: ");
            System.out.print("Enter username: ");
            username = sc.next();
            System.out.print("Enter password: ");
            pass = sc.next();
        }while((!username.equals("Rohith"))||(!pass.equals("Rohith_123")));
        System.out.println("Successfully logged in.");
    }
}