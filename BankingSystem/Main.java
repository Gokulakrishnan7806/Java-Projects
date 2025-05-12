import java.util.Scanner;

class Main
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        System.out.println(" Enter The PIN");
        String Spin=input.next();

        BankingSystem Account = new BankingSystem(122345, 5000,"1234");

        if(Account.authentication(Spin)){
            System.out.println("Invalid PIN Access Dined ");
        }







        System.out.println(" Welcome to Banking System!! ");

        while(true) {




            System.out.println("1. deposit ");
            System.out.println("2. withdrawn ");
            System.out.println("3. balance ");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");
            int choice = input.nextInt();


            switch (choice) {




                case 1:

                    System.out.println(" Enter your deposit Amount");
                    int depositAmount=input.nextInt();
                    Account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.println(" Enter your Withdrawn Amount");
                    int withdrawnAmount=input.nextInt();
                    Account.withdrawn(withdrawnAmount);
                    break;

                case 3:

                   Account.checkBalance();
                   break;
                case 4:

                    Account.history();
                    break;

                case 5:

                    System.out.println(" Thank For Using Banking System ");
                    break;

                default:
                    System.out.println("Invalid Action");
            }
        }


    }
}