interface father{
    abstract void walking();
}
interface mother{
    abstract void talking();
}
class son implements father,mother{
    public void talking(){
        System.out.println("My Mom is Talking");
    }
    public void walking(){
        System.out.println("My Father is Walking");
    }
}
public class Multiple_Inheritance {
    public static void main(String[] args) {
        son s = new son();
        s.talking();
        s.walking();
    }
}
