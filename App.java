import java.util.Scanner;

public class App {
    static void login(customer c){
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        bank b = new bank();
        while (loop){
            System.out.println("\n1) Add money");
            System.out.println("2) Transfer Money");
            System.out.println("3) Check Balance");
            System.out.println("4) Logout");
            System.out.print("Enter Operation : ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    b.addmoney(c);
                    break;

                case 2:
                    System.out.print("\nEnter the Account ID to transfer money into : ");
                    int tid = sc.nextInt();
                    if (bank.customers.keySet().contains(tid)) b.transfermoney(c, bank.customers.get(tid));
                    else System.out.println("Invalid Account ID");
                    break;

                case 3:
                    System.out.println("\nAccount Balance : " + c.balance);
                    break;

                case 4:
                    System.out.println("\nLogging out\n");
                    loop = false;
                    break;
            
                default:
                System.out.println("Invalid Choice");
                    break;
            }
        }
    }
    public static void main(String[] args){
        boolean loop=true;
        Scanner sc = new Scanner(System.in);
        while (loop){
            System.out.println("1) Create Bank account");
            System.out.println("2) Login");
            System.out.println("3) Exit");
            System.out.print("Choose an operation : ");

            int choice = Integer.parseInt(sc.next());

            switch (choice) {
                case 1:
                    System.out.print("\nName : ");
                    String name = sc.next();
                    System.out.print("Age : ");
                    int age = sc.nextInt();
                    customer c = new customer(name, age);
                    bank.customers.put(c.id, c);
                    System.out.println("\nAccount created");
                    System.out.println("Your ID : " + c.id);
                    System.out.println("Name : " + c.name + "\n");
                    break;
                
                case 2:
                    System.out.print("\nEnter your ID : ");
                    int id = sc.nextInt();
                    if (bank.customers.keySet().contains(id)){
                        System.out.println("Login Successful");
                        login(bank.customers.get(id));
                    }
                    else System.out.println("Invalid ID. Try again");
                    break;

                case 3:
                    loop = false;
                    break;
            
                default:
                    System.out.println("Invalid choice for operation");
                    break;
            }
        }
    }
}
