package Chapter3;

public class InvoiceTest {
public static void main(String [] args){
    Invoice invoice1 = new Invoice("2222", "Desk",1, 250.50);
    System.out.printf("INVOICE 1%nNumber: %s%nDescription: %s%nQuantity: %d%nPrice per item: $ %,.2f%nInvoice amount: $ %,.2f%n%n",
            invoice1.getNumber(), invoice1.getDescription(), invoice1.getQuantityPurchased(),
            invoice1.getPricePerItem(), invoice1.getInvoiceAmount());
}//not done

}


