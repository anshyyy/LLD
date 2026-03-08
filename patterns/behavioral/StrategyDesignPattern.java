// Strategy patten is creational pattern that lets us define a family of algorithm, put each other at different classes ans make their object inter changeable
//this is used when we have multiple ways to do the same task, and we want to decide a way at runtime without changing the client code


/* 

  class PaymentService {

    public void pay(String paymentType, double amount) {

        if(paymentType.equals("CREDIT_CARD")) {
            System.out.println("Paid " + amount + " using Credit Card");
        }

        else if(paymentType.equals("UPI")) {
            System.out.println("Paid " + amount + " using UPI");
        }

        else if(paymentType.equals("PAYPAL")) {
            System.out.println("Paid " + amount + " using PayPal");
        }
    }
}

// this is code when we have multple payments options, this can fail as we have to change the client code everytime when we have to do something, 
this also brokes the open-closed principle

to solve this type of problems we have strategy pattern
*/

package patterns.behavioral;

interface PaymentStrategy {
     public void pay(double amount);
}


class CreditCardPayment implements PaymentStrategy {

      
    private String creditCardNo;

    CreditCardPayment(String creditCardNo){
        this.creditCardNo = creditCardNo;
    }

    @Override
    public void pay(double amount){
        System.out.println("Paying with Credit Card No: "+ this.creditCardNo + "amount : "+amount);
    }
}



class UPIPayment implements PaymentStrategy{

    private String upiId;

    UPIPayment(String upiId){
        this.upiId = upiId;
    }
    
    @Override
    public void pay(double amount){
        System.out.println("Paying with UPI id: "+ this.upiId + "amount : "+amount);
    }
}


class PaymentContext {
     private PaymentStrategy paymentStrategy;
     
     PaymentContext(PaymentStrategy strategy){
        this.paymentStrategy = strategy;
     }

     public void processPayment(double amount){
         this.paymentStrategy.pay(amount);
     }
}


// PaymentContext context = new PaymentContext(new CreditCardPayment("1234"));

// context.processPayment(1000);

// context = new PaymentContext(new UpiPayment("user@upi"));

// context.processPayment(500);













