interface Interface1 {
    abstract void add();
}
class sum implements Interface1 {
   public void add(){
       int sum = 5+9;
       System.out.println("sum "+sum);

    }
}

public class Interface {
    public static void main(String[] args) {
        sum s = new sum();
        s.add();
    }
}
