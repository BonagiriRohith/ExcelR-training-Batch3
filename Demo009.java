import java.util.Scanner;
public class Demo009 {
    private String username;
    private long bankaccount;
    private int blnce; 
    void input(){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter your name");
    username=sc.nextLine();
    System.out.println("Enter acc number: ");
    bankaccount=sc.nextLong();
    System.out.println("Enter your balance is :");
    blnce= sc.nextInt();   
    }
    void display(){
        System.out.println("Hello "+username+"\nYour account number is:"+bankaccount+"\nYour Balance is:"+blnce);
    }
    public static void main(String args[]){
    Demo009 obj = new Demo009();
    obj.input();
    obj.display();
 }

}