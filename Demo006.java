import java.util.Scanner;
public class Demo006{
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
    String username = sc.nextLine();
    System.out.println("Enter password: ");
    String pwd = sc.nextLine();
    while(true){
        if(username.equals("Rohtih" ) && pwd.equals("Rohith_123")){
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
