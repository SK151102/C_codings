class a{
    void me()
    {
        System.out.println("hello");
    }
    void me(int age){ //overLoading
        System.out.println(age);
    }
}
public class OverLoading {
    public static void main(String[] args) {
        a b = new a();
        b.me(10);
        b.me();
    }
}
