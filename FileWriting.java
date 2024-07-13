 import java.io.*;
class FileWriting {
    public static void main(String[] args) {
        try {
            File f = new File("Example.txt");
            FileWriter fw = new FileWriter(f);
            fw.write("sangeetha ");
            fw.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}