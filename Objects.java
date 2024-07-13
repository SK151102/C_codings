class Objects {
    String name; // field
    int age; //field
    long phone; //field

    public void display()  {  // method
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
    }
    public void setvalue (String a,int b,long c) {
        name=a;
        age=b;
        phone=c;
    }
}
    class hello {
        public static void main(String[] args) {
            Objects sk = new Objects(); // creating object for class
            sk.setvalue("SARAVANA KUMAR S",21,1234567890);
            sk.display();
            System.out.println(" ");
            Objects sk2 = new Objects(); // creating object for class
            sk2.setvalue("SARAVANA",21,1234567890);
            sk2.display();
        }
    }