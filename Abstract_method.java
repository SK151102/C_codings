abstract class Computer1
{
    abstract void TurnOn();
    abstract void TurnOff();
}
class HP1 extends Computer1{
    @Override
    void TurnOn() {
        System.out.println("HP System On");
    }
    void TurnOff() {
        System.out.println("HP System Off");
    }
}
class Lenovo1 extends Computer1{
    @Override
    void TurnOn() {
        System.out.println("Lenovo System On");
    }
    void TurnOff() {
        System.out.println("Lenovo System Off");
    }
}
public class Abstract_method {
    public static void main(String[] args) {
        HP1 hp = new HP1();
        hp.TurnOn();
        hp.TurnOff();

        Lenovo1 len = new Lenovo1();
        len.TurnOn();
        len.TurnOff();
    }
}
