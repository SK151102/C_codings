public class Recursion_1
{
    public static void main(String[] args) {
        recur(30);
    }
    public static void recur(int n) {
       if(n>0)
       {
           if (n % 2 == 0)
           {
               System.out.print(" " + n);
               recur(n-1);
           }
           else
               recur(n-1);
       }
    }
}
