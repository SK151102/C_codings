abstract class Computer // not able to create a object class for abstract class
{
    void TurnOn(){
        System.out.println("Computer is On");
    }
}
class HP extends Computer{

}
class Lenova extends Computer{

}
public class Abstract_Class {
    public static void main(String[] args) {
        HP hp = new HP();
        hp.TurnOn();

        Lenova lenova = new Lenova();
        lenova.TurnOn();
    }
}
