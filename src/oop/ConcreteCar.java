package oop;

public class ConcreteCar extends AbstractCar implements InterfaceCar {
    @Override
    public void brake() {
        int c = 10;
        System.out.println(c);
        horn();
    }

    @Override
    public void light() {
        int l = 80;
        System.out.println(l);
    }

    @Override
    public void ball() {
        String b = "hello";
        System.out.println(b);
    }
}
