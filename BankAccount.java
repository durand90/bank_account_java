

public class BankAccount {
    private double checkingBallance;
    private double savingsBallance;
    private static int numberOfAccounts = 0;
    private static int totalAmountOfMoney = 0;

    public BankAccount (double checkingBallance, double savingsBallance) {
        this.checkingBallance = checkingBallance;
        this.savingsBallance = savingsBallance;
        this.numberOfAccounts++;
        this.totalAmountOfMoney += checkingBallance + savingsBallance;

    }
    

    public double addToChecking(int amount) {
        //totalAmountOfMoney += amount;
        return this.checkingBallance += amount;
    }

    public double addToSavings(int amount) {
        totalAmountOfMoney += amount;
        return this.savingsBallance += amount;
    }

    public double removeFromchecking(double amount) {
        if (this.checkingBallance > amount) {
            checkingBallance -= amount;
            //totalAmountOfMoney -= amount;
        }
        else {
            System.out.println("insufficient funds");
    }
        return this.checkingBallance;
    }

    public double removeFromSavings(double amount) {
        if (this.savingsBallance > amount) {
            savingsBallance -= amount;
            //totalAmountOfMoney -= amount;
        }
        else {
            System.out.println("insufficient funds");
    }
        return this.savingsBallance;
    }


    public void displayfunds() {
        System.out.println(this.getCheckingBallance());
        System.out.println(this.getSavingsBallance());
    }


    public double getCheckingBallance() {
        return checkingBallance;
    }

    public void getCheckingBallance(int checkingBallance) {
        this.checkingBallance = checkingBallance;
    }

    public double getSavingsBallance() {
        return savingsBallance;
    }

    public void setSavingsBallance(int savingsBallance) {
        this.savingsBallance = savingsBallance;
    }

    public static int getTotal() {
        return totalAmountOfMoney;
    }


    public static int getAccountTotal() {
        return numberOfAccounts;
    }
}