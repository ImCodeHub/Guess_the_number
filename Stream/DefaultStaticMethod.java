package Stream;

import java.util.Comparator;
interface Car{
    public void drive();
    default public void flying(){
        System.out.println("this car can fly");
    };

    static public void crabWalk(){
        System.out.println("this car can walk like a crab");
    }
}
class Audi implements Car{

    @Override
    public void drive() {
        System.out.println("this is audi car");
    }

}

class Tata implements Car{

    @Override
    public void drive() {
        System.out.println("this is tata car");
    }
}

class Bmw implements Car{

    @Override
    public void drive() {
        System.out.println("this is bmw car");
    }
}
public class DefaultStaticMethod {
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.drive();
        audi.flying();

        Tata tata = new Tata();
        tata.drive();
        tata.flying();


        Bmw bmw = new Bmw();
        bmw.drive();
        bmw.flying();
    }
}
