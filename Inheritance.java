class Animal
{
    void food()
    {
        System.out.println("Eating...");
    }
    void activity()
    {
        System.out.println("Sleeping...");
    }
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Barking...");
    }
}
public class Inheritance
{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.food();
        d.sound();
        d.activity();
    }
}
