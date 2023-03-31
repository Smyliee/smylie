import java.io.Serializable;

public class Car implements Serializable {
    String maker;
    String model;

    int year ;
    Person owner;

    public Car(String maker ,String model , int year , Person owner) {
        this.maker = maker;
        this.model=model;
        this.year=year;
        this.owner=owner;

    }

    @Override
    public String toString() {
        return "Car{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", owner=" + owner.name +owner.address +owner.age+
                '}';
    }
}
   class Person implements Serializable {
    String name;
    int age;
    String address;

       public Person(String name , int age , String address) {
           this.name = name;
           this.age=age;
           this.address=address;
       }
   }
