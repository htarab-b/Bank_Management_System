public class customer {
    String name;
    int age, id, balance;
    static int idcount = 101;
    public customer(String name, int age){
        this.age = age;
        this.name = name;
        this.id = idcount;
        this.balance = 0;
        idcount++;
    }
}