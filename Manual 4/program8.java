package nit_sem2_LM4;

class Bank {
    String name;
    int ac;
    char acType;
    int amount;
    
    Bank(String name, int ac, char acType, int amount) {
        this.name = name;
        this.ac = ac;
        this.acType = acType; 
        this.amount = amount;
    }
    
    void deposit(int amount) {
        this.amount += amount;
    }
    
    void withdraw(int amount) {
        if (this.amount >= amount)
            this.amount -= amount;
        else
            System.out.println("Insufficient Balance...");
    }
    
    void display() {
        System.out.println("Name is " + this.name);
        System.out.println("Balance is " + this.amount);
    }
    
    public static void main(String...args) {
        Bank b = new Bank("shivam", 123456, 's', 5000);
        b.display();
    }
}
