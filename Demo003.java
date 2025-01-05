import java.util.Scanner;
public class Demo003{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number1: ");
        int num1=sc.nextInt();
        System.out.println("enter number2: ");
        int num2=sc.nextInt();
        System.out.println("enter number3: ");
        int num3=sc.nextInt();      
        if(num1 > num2 && num1 > num3)
        System.out.println(".(Num1 is greater)");
        else if((num2 > num3) &&( num2 > num1)){
        System.out.println("Num2 is greater");
          }   else{
            System.out.println(num3+" is greater");
        }
    }
}

