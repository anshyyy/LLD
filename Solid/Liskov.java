public class Liskov {}


// a child class properly replcaes the parent class without breaking the architecture
// supoose class B is subtype of class A then we should be able to use B anywhere we use A


// class BankAccount {
//     public void withdraw(double amount){
//         System.out.println("withdrawn : " + amount);
//     }
// }



// class SavingAcount extends BankAccount {
//     @Override
//     public void withdraw(double amount){
//                System.out.println("withdrawn from savings : " + amount);
//     }
// }


// class CurrentAccount extends BankAccount{
//     @Override
//     public void withdraw(double amount){
//                System.out.println("withdrawn from current : " + amount);
//     }
// }


// // these all are fine till we have other bank accounts like FD Bank account

// class FixedDepositAccount extends BankAccount{
//      @Override
//     public void withdraw(double amount){
//                throw new UnsupportedOperationException("Withdrawn is not possible in the FixedDeposit Account");
//     }
// }

// so fd account cannout replace BankAccount this creates a violation


interface Account{
    public void deposit(double amount);
}

interface Withdrawable{
    public void withdraw(double amount);
}

class SavingAcount implements Account, Withdrawable {

    @Override
    public void withdraw(double amount){
               System.out.println("withdrawn from savings : " + amount);
    }

    @Override
    public void deposit(double amount){
        System.out.println("Deposited in savings account : " + amount);
    }
}


class FixedDepositAccount implements Account {
    @Override
    public void deposit(double amount){
        System.out.println("Deposited in Fixed account : " + amount);
    }
}








