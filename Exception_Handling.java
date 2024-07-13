import java.util.Scanner;
public class Exception_Handling {
    static void check(int age){
        if(age<18){
            throw new ArithmeticException("NOT Able to Access");
        }
    }
    public static void main(String[] args) {
        int a,b,age;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter age : 20");
        age=obj.nextInt();
        System.out.println("Enter A : ");
        a=obj.nextInt();
        System.out.println("Enter B : ");
        b=obj.nextInt();
        try{
            check(age);
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("INVALID INPUT");
        }
        finally{
            System.out.println("CODE EXECUTED");
        }
    }

}
