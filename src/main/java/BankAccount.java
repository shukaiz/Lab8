/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * To distinguish between different kinds of accounts.
     */
    public enum BankAccountType {

        /**
         * Checking account.
         */
        CHECKINGS,
        /**
         * Savings account.
         */
        SAVINGS,
        /**
         * Student account.
         */
        STUDENT,
        /**
         * Working account.
         */
        WORKPLACE

    }

    /**
     * Total amount of bank accounts opened.
     */
    private static int totalAccounts = 0;

    /**
     * account type.
     */
    private BankAccountType accountType;
    /**
     *  account balance.
     */
    private double accountBalance;
    /**
     * owner name.
     */
    private String ownerName;
    /**
     * interest rate.
     */
    private double interestRate;
    /**
     * interest earned.
     */
    private double interestEarned;

    /**
     * Setting up a bank account.
     * @param name Name of the account owner.
     * @param accountCategory Account type.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {

        this.accountType = accountCategory;
        this.ownerName = name;
        totalAccounts++;

    }

    /**
     * Get the account balance.
     * @return the account balance.
     */
    public double getBalance() {
        return accountBalance;
    }

    /**
     * Withdraw money from the account.
     * @param amount to withdraw.
     */
    public void getMoney(final double amount) {
        this.accountBalance -= amount;
    }

    /**
     * Deposit money into the account.
     * @param amount to deposit.
     */
    public void addMoney(final double amount) {
        this.accountBalance += amount;
    }

    /**
     * Change the name of the owner.
     * @param name The new owner name;
     */
    public void changeName(final String name) {
        this.ownerName = name;
    }

    /**
     * Get the total amount of accounts.
     * @return the total amount of accounts.
     */
    public static int getAccountAmount() {
        return totalAccounts;
    }

}