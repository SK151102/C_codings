public class Predefined {
    public static void main(String[] args) {
        String s = Integer.toString(6);
        System.out.println(s);
        String x =  Integer.toBinaryString(8);
        System.out.println(x);
        int a = Integer.parseInt(x);
        System.out.println(a);
        int b = Integer.valueOf(x);
        System.out.println(b);
    }
}
