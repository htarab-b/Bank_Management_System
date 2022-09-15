import java.util.HashMap;
import java.util.Scanner;

public class bank {
    static HashMap<Integer, customer> customers = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public void addmoney(customer c){
        System.out.print("\nAmount to be added : ");
        int money = sc.nextInt();
        c.balance += money;
        System.out.println("New Balance : " + c.balance);
    }

    public void transfermoney(customer c, customer t){
        System.out.print("Amount to transfer : ");
        int amount = sc.nextInt();
        if (amount > c.balance) System.out.println("Not enough balance to transfer the amount");
        else{
            c.balance -= amount;
            t.balance += amount;
            System.out.println("Amount " + amount + " transferred to " + t.name);
        }
    }
}
