public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String id = "1122";
        double balance = 1000;
        String name = "George";
        Account acc =new Account(id, balance, name);
        System.out.println("Name : "+acc.getName());
        System.out.println("Account ID: "+acc.getId());
        System.out.println("Annual interest rate: "+ acc.getAnnualInterestRate());
        System.out.println("Balance: "+acc.getBalance());

        
        System.out.println("date\t\t\t\ttype\t\t\tamount\t\t\tbalance");
        acc.deposit(30);
        acc.deposit(40);
        acc.deposit(50);
        acc.withdraw(5);
        acc.withdraw(4);
        acc.withdraw(2);
         for(int i= 0 ;i<acc.getArrayListSize();i++){

            System.out.println(acc.getMember(i));
         }


        
        
          
          

    }
}