class subburaj1
{
    long ph = 1234567890L;
    void bank()
    {
        System.out.println("BANK");
    }
}
class sangee1 extends subburaj1
{
    int age=23;
}
class tamil extends sangee1
{
    int age=25;
}
class meena1 extends subburaj1
{
    int age=22;
}
public class hybrid_Inheritance {
    public static void main(String[] args) {
        tamil s = new tamil();
        meena1 m = new meena1();
        s.bank();
        System.out.println(s.ph);
        System.out.println(s.age);
        m.bank();
        System.out.println(m.ph);
        System.out.println(m.age);
    }
}