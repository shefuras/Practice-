package oop;

public class PolymorphismCar {
    public void bus(int b, int s ){
        int d= (b+s);
        System.out.println(d);
    }
    public void bus (int b, int s, int k, int t){
        int a = (k-t);
        int d= (b+s);
        System.out.println(a);
    }


}
//Two types - method overloading same method, different parameter, same clas
// method overriding- same method, same parameter, different body in a different class
//overriding happens between two different classes when we use extends