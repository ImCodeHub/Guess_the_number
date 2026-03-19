import java.io.File;
import java.io.IO;
import java.util.Arrays;

enum Role{
    ADMIN {
        @Override
        public boolean canDelete() {
            return true;
        }

        @Override
        public boolean canAdd() {
            return true;
        }
    },
    USER {

        @Override
        public boolean canDelete() {
            return false;
        }

        @Override
        public boolean canAdd() {
            return true;
        }
    },
    CASUAL_USER {
        @Override
        public boolean canDelete() {
            return false;
        }

        @Override
        public boolean canAdd() {
            return false;
        }
    };

    public abstract boolean canDelete();
    public abstract boolean canAdd();


}

class Address{
    String city;
    int pin;

    public Address(String city, int pin) {
        this.city = city;
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pin=" + pin +
                '}';
    }
}

class Person{
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
public class Main {
    public void main(String[] xyz) {

        Address a1 = new Address("Indore",459001);
        Person p1 = new Person("Ankit",a1);

        Person p2 = new Person(p1.name, new Address(p1.address.city,p1.address.pin ));

        p2.address.city="delhi";

        IO.println(p1);
        IO.println(p2);

    }
}













