class Father
{
    char Gender='M';
    void print()
    {
        System.out.println("Good");
    }
}
class Son extends Father
{

}
public class SingleInheritance {
    public static void main(String[] args) {
        Son obj = new Son();
        System.out.println(obj.Gender);
        obj.print();
    }
}
