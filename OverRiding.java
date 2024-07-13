class S{
    void age(){
        System.out.println("Age is 18");
    }
}
class SS extends S{
    @Override
    void age(){
        System.out.println("Age is 22");
    }
}
class SSS extends SS{
    @Override
    void age(){
        System.out.println("Age is 23");
    }
}
public class OverRiding {
    public static void main(String[] args) {
        SSS s = new SSS();
        s.age();
    }
}
