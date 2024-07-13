class ClassObjects {
    String name; // field
    int age; //field
    long phone; //field

    public void display()  {  // method
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
    }

    public static void main(String[] args) {
        ClassObjects sk = new ClassObjects(); // creating object for class
        sk.name = "Saravana Kumar S";
        sk.age = 21;
        sk.phone = 1234567890L;
        sk.display();
    }
}