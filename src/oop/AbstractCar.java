package oop;

public abstract class AbstractCar {
    public void brake (){
        System.out.println("The car has a brake");
    }
    public abstract void light(); // this is an abstract method
    public void horn(){
        System.out.println("horn");
    }

}
/*cannot have a main method (psvm)
cannot use static and abstract key word in the same method
cannot use a method body at all when using abstract key word
abstract class cannot be used to create objects
abstract class carry both abstract and non-abstract methods
you can always extend abstract class but you cannot implement abstract class
In Java abstraction is a process of hiding implementation*/