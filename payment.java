 abstract class payment {
    protected double amount;
payment(double amount) {
        this.amount = amount;
    }
 abstract void pay();
 void receipt() {
        System.out.println("Receipt generated");
        System.out.println("Amount paid: $" + amount);
    }
void showpaymentStatus() {
        System.out.println("Payment Successful");
    }
}
class upipayment extends payment {
    private String upiId;
upipayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }
void pay() {
        System.out.println("Processing upi payment...");
        System.out.println("UPI ID: " + upiId);
    }
class cardpayment extends payment {
    private String CardNumber;
 cardpayment(double amount, String CardNumber) {
        super(amount);
        this.CardNumber = CardNumber;
    }
 void pay() {
        System.out.println("Processing card payment");
        String lastFour = CardNumber.substring(CardNumber.length() - 4);
        System.out.println("cardNumber: **** **** **** " + 5678);
    }
}
public class Main {
    public static void main(String[] args) {
        payment p1 = new upipayment(550.75, "Maheswari@oksbi");
        payment p2 = new cardpayment(250.50, "1234567812345678"); 
        p1.pay();
        p1.receipt();
        p1.showpaymentStatus();
System.out.println();
p2.pay();
        p2.receipt();
        p2.showpaymentStatus();
    }
}
