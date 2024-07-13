import java.awt.*;
import java.util.*;

public class ReferenceDatatype
{
    public static void main(String[] args) {
        int a=5;  // int is a premitive datatype
        int b=a;
        a=8;
        System.out.println(a);
        System.out.println(b);

        Date today=new Date(); // Date is a Reference datatype
        System.out.println(today);

        Point p1=new Point(5,6);
        Point p2 = p1;
        System.out.println(p2);
        p1.x=4;
        System.out.println(p1);
        System.out.println(p2);

    }
}
