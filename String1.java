import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(s);
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if(ch[i]!='a'&&ch[i]!=' ') {
                System.out.print(ch[i]);
            }
            }
        }
    }

