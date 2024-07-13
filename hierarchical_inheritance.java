class subburaj
{
    long ph = 1234567890L;
    void bank()
    {
        System.out.println("BANK");
    }
}
class sangee extends subburaj
{
 int age=23;
}
class meena extends subburaj
{
    int age=22;
}
public class hierarchical_inheritance {
    public static void main(String[] args) {
        sangee s = new sangee();
        meena m = new meena();
        s.bank();
        System.out.println(s.ph);
        System.out.println(s.age);
        m.bank();
        System.out.println(m.ph);
        System.out.println(m.age);
    }
}
