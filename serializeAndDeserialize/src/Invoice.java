import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Invoice implements Serializable {
    int number ;
    Date date ;
    List<LineItem> lineItems;
    Invoice(int number ,Date date , List lineItems){
        this.number=number;
        this.date= date;
        this.lineItems=lineItems;
    }

}

 class LineItem {
     String discription;
     int quantity ;
     double price;
     LineItem (String discription , int quantity, double price){
         this.discription=discription;
         this.quantity=quantity;
         this.price=price;
     }


 }
