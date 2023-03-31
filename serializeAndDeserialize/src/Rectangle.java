import java.io.Serializable;

public class Rectangle implements Serializable {
    double width ;
    double height;
    public Rectangle(double width , double height){
        this.width=width;
        this.height=height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
