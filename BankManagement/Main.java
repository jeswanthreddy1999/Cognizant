public class Main{
    
    public static void main(String args[]){
        Customer c= new Customer(2,"Jaswanth","jesh@gmail.com");
        SavingsAccount sc= new SavingsAccount(1234,c,5000,1000);
        System.out.println(sc.withdraw(3000));
    }
}