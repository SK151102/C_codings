import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        int a;
        int count=0;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a number : ");
        a=ob.nextInt();
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}
