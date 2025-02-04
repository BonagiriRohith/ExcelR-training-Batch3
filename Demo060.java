public class Demo060{
    public static void main(String[] args) {
        int  count = 20; int num1=0; int num2 = 1;
        for(int i =0;i<count;++i){
            System.out.print(num1+" ");
            int sumofprev = num1+num2;
            num1 = num2;
            num2 = sumofprev;
        }
    }
}