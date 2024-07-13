public class method_2
{
    public static void main(String[] args) {
        System.out.println(add(10,3));
        int d=add(7,9);
        d*=10;
        System.out.println(d);
    }
    public static int add(int a, int b)  // non void parameterised function
    {
        int c = a + b;
        return c;
    }
}
