public class Recursion
{
    public static void main(String[] args) {
    res(20);
    }

    public static void res(int n) {

        //base case
        if(n==1) {
            System.out.print(" "+n);
        }

        //recursion case
        else {
            System.out.print(" "+n);
            res(n - 1);
        }
    }
}
