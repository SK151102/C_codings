import java.util.Scanner;
import java.io.File;

public class FileReading {
    public static void main(String[] args) {
        try{
            File f=new File("Example.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
