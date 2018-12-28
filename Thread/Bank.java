public class Bank {
    private int balance = 0;

    Bank(int amount) {
        balance = amount;
    }

    // Withdraw
    public synchronized void withdraw(int amount) {
        System.out.println("Beginning Transaction");
        if (this.balance < amount) {
            System.out.println("current Balance: " + balance);
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.balance -= amount;
        System.out.println("current Balance: " + balance);
        System.out.println("withdraw completed...");
    }

    // Deposit
    public synchronized void deposit(int amount) {
        System.out.println("Beginning Transaction");
        balance += amount;
        System.out.println("current Balance: " + balance);
        notify();
    }

    // Main
    public static void main(String[] args) {
        Bank person = new Bank(10000);

        new Thread() {
            public void run() {
                person.withdraw(15000);
            }
        }.start();

        new Thread() {
            public void run() {
                person.deposit(20000);
            }
        }.start();

    }

}