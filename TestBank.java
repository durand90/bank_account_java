public class TestBank {
    
    public static void main(String[] arg) {
        
        BankAccount person1 = new BankAccount(250, 100); 
        BankAccount person2 = new BankAccount(300, 2200);
        BankAccount person3 = new BankAccount(500, 3000);

        System.out.printf("person1 Checking: %s\n",person1.getCheckingBallance());
        System.out.printf("person1 Saving: %s\n", person1.getSavingsBallance());
        //System.out.println(person2.getSavingsBallance());
        //System.out.println(person3.getSavingsBallance());
        System.out.println("----------All Accounts---------------------");
        System.out.printf("Total amount of money in all accounts: %s\n", BankAccount.getTotal());
        System.out.printf("Total number of accounts: %s\n", BankAccount.getAccountTotal());
        System.out.println("--------------Peerson1-----------------");
        person1.displayfunds();
        System.out.println("------------Person2-------------------");
        person2.displayfunds();
    }
}
