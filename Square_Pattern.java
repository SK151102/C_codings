import java.util.Scanner;

public class Square_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side : ");
        int side = sc.nextInt();
        for(int i=1;i<=side;i++){
            for(int j=1;j<=side;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
