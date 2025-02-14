class Solution {
    public int subtractProductAndSum(int n) {
      int sum =0;
      int product =1;
      while(n>0){
        sum +=n%10;
        product*=n%10;
        n=  n/10;

      }
      return product - sum;

    }
}
public class LTCode012 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 234;
        System.out.println(sol.subtractProductAndSum(n));
    }
    
}
