public class while_dowhile_loop {
    public static void main(String[] args) {
        int a=5;
        int fact=1;

        while(a>0)
        {
           fact*=a;
           a--;
        }
       /* do {
            fact*=a;
            a--;
        } while (a!=0); */
        System.out.println("Factorial of is "+fact);
    }
}
