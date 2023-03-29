public class Q1vehicle {
 private  String maker;
 private  String model;
 private int year;
 private double mileage;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Q1vehicle{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
 class  Car extends Q1vehicle{
     private int numDoors;

     public int getNumDoors() {
         return numDoors;
     }

     public void setNumDoors(int numDoors) {
         this.numDoors = numDoors;
     }
 }
class Truck extends Q1vehicle{
    double maxPayload;

    public double getMaxPayload() {
        return maxPayload;
    }

    public void setMaxPayload(double maxPayload) {
        this.maxPayload = maxPayload;
    }

    public static void main(String[] args){
        Car car1=new Car();
        Truck truck1 = new Truck();
        System.out.println("Car Details");
        car1.setMaker("Maruti Suzuki");
        car1.setModel("abc123");
        car1.setYear(2016);
        car1.setMileage(60d);
        car1.setNumDoors(4);
        System.out.println(car1.toString());
        car1.toString();
        System.out.println("Truck Details");
        truck1.setMaker("Maruti Suzuki");
        truck1.setModel("abc123");
        truck1.setYear(2016);
        truck1.setMileage(90d);
        truck1.setMaxPayload(100);
        System.out.println(truck1.toString());
    }
}