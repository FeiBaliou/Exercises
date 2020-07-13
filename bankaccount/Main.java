package bankaccount;

/**
 *
 * @author feiba
 */
public class Main {

    public static void main(String[] args) {
    
        
     System.out.println("First Person:");
     System.out.println("");
     
     //Create First Person  
     Person p1 = new Person();
     
     //Create First account for First person
     BankAccount b1 = new BankAccount();
       
        b1.deposit();       
        b1.withdraw();
        b1.withdraw();
      
     //Add b1 transactions arraylist to p1 person.arraylist
     p1.getPerson().addAll(b1.getTransactions());
     p1.getPerson().add(0,p1.getLastName().toUpperCase() + " ACCOUNTS");
     
     
     System.out.println("");
     System.out.println("Create second account for first person:");
        
     //Create Second Account for the First persom
     BankAccount b2 = new BankAccount();
      
        b2.deposit();       
        b2.withdraw();
    
    //Add b2 transactions to  p1 person.arraylist
     p1.getPerson().addAll(b2.getTransactions());
     
   
     System.out.println("");
     System.out.println("Second person:");
     System.out.println("");
     
     //Create second person
     Person p2 = new Person();
     
     //Create first account for Second person
      BankAccount b3 = new BankAccount();
       
        b3.deposit();       
        b3.withdraw();
        
      //Add b3 transactions to p2 person.arraylist
       p2.getPerson().addAll(b3.getTransactions());  
        
       
      //Give Access to person p2 for person p1 accounts
       p2.getPerson().addAll(p1.getPerson());
       p2.getPerson().add(0,p2.getLastName().toUpperCase()+ " ACCOUNTS" );
      
      
 System.out.println("--------------------------------------------------------------------------------------------");
      


        //Print Lists for person p1 and person p2 
          int min = Math.min(p1.getPerson().size(), p2.getPerson().size());
           for (int i = 0; i < min; i++) {
               System.out.println(p1.getPerson().get(i) + "\t\t\t\t" + p2.getPerson().get(i));
           }
           
        //IF  ammounnt of transactions is not the same for each Account.
           if (p1.getPerson().size() < p2.getPerson().size()) {
               for (int i = min; i < p2.getPerson().size(); i++) {
                   System.out.println("-" + "\t\t\t\t\t\t" + p2.getPerson().get(i));
               }
           } else if (p1.getPerson().size() > p2.getPerson().size()) {
               for (int i = min; i < p1.getPerson().size(); i++) {
                   System.out.println(p1.getPerson().get(i)+ "\t\t\t\t\t\t" + "-");
               }
           }
        
    
        System.out.println("-------------------------------------------------------------------------------------");
    
        System.out.println("Accounts created:" + BankAccount.getAccountsOpened());
        
        System.out.println("Balance for " + p1.getLastName().toUpperCase() + ": " + ( b1.getBalance()+b2.getBalance() ) + "€" );
        System.out.println("Balance for " + p2.getLastName().toUpperCase() + ": " + (  b1.getBalance()+b2.getBalance() + b3.getBalance()) + "€" );
        
}
}
