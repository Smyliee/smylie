public class Sample {
    int x;
    int y;

     void division(int x, int y) {

        try {
           int z = x/y;
           }
        catch (ArithmeticException E) {
        System.out.println(" y cant be 0 " +E);
    }
         System.out.println("No Exception");
    }
    public static void main(String [] args) {
        Sample s = new Sample();
        s.division(5,10);
    }
}
