import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        int a;
        double r=0,res;
        int b,c;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = sc.nextInt();
        b=a;
        c=b;
        while(a>0){
            a=a/10;
            count++;
        }
        while (b>0) {
             res=b%10;
             r= r+(Math.pow(res,count));
             b=b/10;
        }
        if(r==c)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
