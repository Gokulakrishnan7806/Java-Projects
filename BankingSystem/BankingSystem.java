import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
    private int AccountNumber;
    private double balance;
    private String pin;
    private ArrayList<String> History;



    BankingSystem(int AccountNubmer, double balance, String pin) {

        this.AccountNumber = AccountNubmer;
        this.balance = balance;
        this.pin = pin;
        this.History=new ArrayList<>();
    }

    public void deposit(double amount) {

        if (amount > 0) {
            System.out.println("Deposit your amount is : " + amount);
            balance = balance + amount;
            System.out.println(" Thanking for deposited the Amount " + amount);
        } else {
            System.out.println("Inavlid Amount pleace Enter Correct Amount");
        }

    }


    public void withdrawn(double amount) {
        if ((amount > 0) && (balance >= amount)) {

            System.out.println(" Pleace Enter Your Amount " + amount);
            balance = balance - amount;
            System.out.println(" Withdrawn "+amount);
        } else {
            System.out.println("Amount detile is invalid or insufficiant Balance.");

        }
    }

    public void checkBalance() {
        System.out.println(" Available Balance: " + balance);

    }


    public boolean authentication(String SecretPin)
    {
        if(pin.equals(SecretPin))
        {

            return !this.pin.equals(SecretPin);

        }
        else {
            return true;
        }

    }

    public void history(){

        for( String myhistory : History)
        {
            System.out.println(" Transaction History: "+ myhistory); 
        }
    }
}







