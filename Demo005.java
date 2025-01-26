import java.util.Scanner;
public class login{
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
    String username = sc.nextLine();
    System.out.println("Enter password: ");
    String pwd = sc.nextLine();
    while(true){
        if(username.equals("user001" ) && pwd.equals("user_001")){
        System.out.println("Happy New Year");
        break;
        }
        
        else{
            System.out.println("Please enter valid credentials");
            break;
        }
    }

    }
}
