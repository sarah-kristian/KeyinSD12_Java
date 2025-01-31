public class TestAccount {
    public static void main(String[] args){
        Account Acc1 = new Account("Acc1", "Buddy", 5000);
        Account Acc2 = new Account("Acc2", "Missus", 4000);
        System.out.println("Acc1: " + Acc1.getBalance()); // Acc1: 5000
        System.out.println("Acc2: " + Acc2.getBalance()); // Acc2: 4000
        System.out.println("Acc1: " + Acc1.getBalance()); // Acc1: 4000
        System.out.println("Acc2: " + Acc2.getBalance()); // Acc2: 5000
    }
}
