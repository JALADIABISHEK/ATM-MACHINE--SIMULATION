package ATMMachine;

import java.util.Scanner;

class ATM{

     float Balance;
     int PIN=9381;

     public void checkpin(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a PIN: ");
         int enteredpin=sc.nextInt();

         if(enteredpin==PIN){
             menu();
         }
         else{
             System.out.println("Enter a Valid PIN ");
         }
     }

     public void menu(){
         System.out.println("Enter your choice:");
         System.out.println("1. Check Account Balance");
         System.out.println("2. Withdraw Money");
         System.out.println("3. Deposit Money");
         System.out.println("4. EXIT");

         Scanner sc=new Scanner(System.in);
         int opt=sc.nextInt();

         if(opt == 1){
             checkBalance();
         }
         else if(opt == 2){
             withdrawMoney();
         }
         else if(opt == 3){
             depositMoney();
         }
         else if(opt == 4){
             return;
         }
         else{
             System.out.println("Enter a Valid Choice");
         }

     }
     public void checkBalance(){
         System.out.println("Balance: "+Balance);
         menu();
     }

     public void withdrawMoney(){
         System.out.println("Enter amount to withdraw: ");
         Scanner sc=new Scanner(System.in);
         float amount=sc.nextFloat();

         if(amount>Balance){
             System.out.println("Insufficient Balance");
         }
         else{
             Balance=Balance-amount;
             System.out.println("Money Withdrawl Successful");
         }
         menu();
     }

     public void depositMoney(){
         System.out.println("Enter amount: ");
         Scanner sc=new Scanner(System.in);
         float amount=sc.nextFloat();
         Balance=Balance+amount;
         System.out.println("Money Deposit Successful");
         menu();
     }

}

public class ATMMachine{
    public static void main(String args[]){

        ATM obj=new ATM();
        obj.checkpin();

    }
}