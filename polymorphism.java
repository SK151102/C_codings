class hello1
{
    void display()
    {
        System.out.println("Hello Everyone");
    }
    void display(String s,int a)           // method name is same but different parameter or signature
    {
        System.out.println(s+" "+"AGE "+a);
    }
}
public class polymorphism
{
    public static void main(String[] args) {
        hello1 h = new hello1();
        h.display();
        h.display("I am SK",21);
    }
}
