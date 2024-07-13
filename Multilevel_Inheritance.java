class GrandFather
{
    char Gender='M';
    void print()
    {
        System.out.println("Good");
    }
}
class Father1 extends GrandFather{

}
class Son1 extends Father1
{

}
public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Son1 obj = new Son1();
        System.out.println(obj.Gender);
        obj.print();
    }
}