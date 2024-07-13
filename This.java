class New{
    char A;
    int num;
    void display(char A, int num){
        this.A = A;
        this.num = num;
    }
}
public class This {
    public static void main(String[] args) {
        New obj = new New();
        obj.display('a', 5);
        System.out.println(obj.A);
        System.out.println(obj.num);
    }
}
