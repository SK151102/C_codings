class home{
    int a=9;
    int b=3;
    void get(){
        System.out.println("How Are You ");
    }
}
class room extends home{
    int a=5;
    int b=6;
    void gets(){
        System.out.println("Who Are You ");
        super.get();
        System.out.println(super.a);
        System.out.println(super.b);
        System.out.println("Bye Bye");
        System.out.println(a);
        System.out.println(b);
    }
}
public class Super {
    public static void main(String[] args) {
        room obj = new room();
        obj.gets();
    }
}
