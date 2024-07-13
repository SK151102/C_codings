class one{
    final int a =5;
    final void num(){
        // a=4;
        System.out.println("THIS IS A");
    }
}
class two extends one{

   /* void num(){
      System.out.println("THIS IS Not A");
   }*/

}


public class Final {
    public static void main(String[] args) {
     two obj = new two();
     obj.num();

    }
}
