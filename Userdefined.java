class Skk extends Exception {
    Skk(String str){
        super(str);
    }
}

public class Userdefined {
  static  void check(int age) throws Skk {
        if(age<18){
            throw new Skk("INVALID");
        }
        else {
            throw new ArithmeticException("VALID");
        }
    }
    public static void main(String[] args) {
        try{
            check(22);

        }
        catch(Skk E){
            System.out.println(E);
        }
        catch(ArithmeticException S){
            System.out.println(S.getMessage());
        }

    }
}
