package basic;

abstract class Bank {
   
    abstract int getBalance();
}

class BankA extends Bank {
    private int balance;

    public BankA() {
        this.balance = 100;
    }

    @Override
    int getBalance() {
        return balance;
    }
}

class BankB extends Bank {
    private int balance;

    public BankB() {
        this.balance = 150;
    }

    @Override
    int getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    private int balance;

    public BankC() {
        this.balance = 200;
    }

    @Override
    int getBalance() {
    	// TODO Auto-generated method stub
    	return balance;
    }
}

public class Abstract_Bank {
	public static void main(String[] args) {
     
        Bank bA = new BankA();
        Bank bB = new BankB();
        Bank bC = new BankC();

        // Calling the getBalance method for each bank
        System.out.println("BankA balance: $" + bA.getBalance());
        System.out.println("BankB balance: $" + bB.getBalance());
        System.out.println("BankC balance: $" + bC.getBalance());
    }
}
