package basic;


public class Method {
     /*>There are two types of method static and non-static
       >Static and non-static both have return type and void type.
       >You can never write any method inside the psvm block because psvm is also a method
        so you can never write a method inside a method.
       > Anytime when we want to call the property/method of the class, we have to use the object.
       > When we declare a method inside a class we need a body.
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

         System.out.println(method.bag(5, 6));
         int finalBag = method.bag(1, 2);
         System.out.println(finalBag);
         String company = method.phone("samsung");
         System.out.println(company);
         int powerGlass = method.glass(10, 5);
         System.out.println(powerGlass);
         String electronic = method.laptop("HP has both laptops and computers");
         System.out.println(electronic);
         int wig = method.hair(10000, 50);
         System.out.println(wig);
         String beaches = method.florida("Tampa has many beautiful beaches");
         System.out.println(beaches);
         System.out.println(color(3,4));
         int sky = color(3,4);
         System.out.println(sky);
         String metal = bottle("we should recycle plastic bottles");
         System.out.println(metal);;
         method.ball = "cricket";
         System.out.println(method.ball);
         System.out.println(method.bat);
         System.out.println(mouse);
         moon = "in the sky";
         System.out.println(moon);
         pet();
         method.shoe("size 8");
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

    /*>Difference between Return and Void type - data in return type can be carried anywhere but
     data in void type cannot be carried anywhere, it stays where it is.
     >Anything written inside parenthesis is known as Parameter.
     >We always have to store data in return type.

     */
 //Non Static Return Type//
    public int bag (int a, int b) {
        int totalbag = a+b;
        return totalbag;
    }
    public String phone (String s) {
        String company = s;
        return company;
    }
    public int glass (int s, int g) {
        int sunglass = s*g;
        return sunglass;
    }
    public String laptop (String l){
        String computer =l;
        return computer;
    }
    public int hair (int h, int o) {
        int oil = h/o;
        return oil;
    }
    public String florida (String f) {
        String tampa = f;
        return tampa;
    }
    //Static Return Type//
    public static int color (int y, int p) {
        int rainbow = y+p;
        return rainbow;
    }
    public static String bottle (String b){
        String plastic = b;
        return plastic;
    }
    String ball;
    String bat = "6";
        static String mouse = "logitech";
                static String moon;

                public static void pet (){
                    int f = 8;
                    System.out.println(f);
                }
                public void shoe (String bata){
                    System.out.println(bata);
                }


}

