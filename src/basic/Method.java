package basic;


public class Method {
     /*>There are two types of method static and non-static
       >Static and non-static both have return type and void type.
       >You can never write any method inside the psvm block because psvm is also a method
        so you can never write a method inside a method.
       > Anytime when we want to call the property/method of the class, we have to use the object.
       > When we declare a method inside a class we need a body but if we declare a method outside
         of a class we don't need a body.
        */
     public static void main(String[] args) {
         Method method = new Method();
         //object = constructor//
         method.book();
         /*we need to create object & constructor because non static void type doesn't belong to class
         so we need to form a relation between them to make sout work */
         method.pen();
         pencil();
         /*we don't need to create any object & constructor because static method belong to class
                         or it is closely related*/
     }
    //Non Static Void Type//
        public void book() {
        System.out.println("It's a book");
        }
        public void pen() {
         System.out.println("I got myself a new pen");
        }
        //Static Method Void Type//
    public static void pencil (){
        System.out.println("Pencil is incomplete without eraser");
    }


}

