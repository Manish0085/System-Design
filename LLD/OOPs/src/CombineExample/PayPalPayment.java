package CombineExample;


/* Implementing Open/closed principle which says that software entities (classes, module, function) should be open for extension but
     close for modification

     Meaning:
        Open for Extension: You should be able to add new functionality to a class/module
        close for modification: You shouldn't have to change existing tested code when requirements are changed.


 */


public class PayPalPayment implements Payment{

    private String payPalId;

    public PayPalPayment(String payPalId){
        this.payPalId = payPalId;
    }


    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment of " + amount + " via " + this.payPalId);
    }
}
