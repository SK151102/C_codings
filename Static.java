class Exp{
    // String name = "SARAVANA KUMAR S";
    static String name = "SARAVANA KUMAR S";
    int age = 22;
  static  void display()   // static keyword
    {
        System.out.println("Printed the Informatiom");
    }
}
class Sub extends Exp {

}
public class Static {
    public static void main(String[] args) {
       Exp.display(); // able to access without creating the Object // by using the static keyword
        System.out.println(Exp.name);
        Sub.name="KUMAR S";
        System.out.println(Exp.name);

       /* User u=new User();
        System.out.println(u.name);

        Sub s=new Sub();
        s.name="SK";
        System.out.println(s.name);
        System.out.println(u.name); */
    }
}
