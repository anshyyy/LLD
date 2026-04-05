package problems.FoodDelivery.strategies;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    private String creditCardNumber;
     
    CreditCardPaymentStrategy(String creditCardNumber){
        this.creditCardNumber = creditCardNumber;
    }


    @Override
    public void pay(double amount){
       System.out.println("Paid Amount : "+ amount);
    }
}
