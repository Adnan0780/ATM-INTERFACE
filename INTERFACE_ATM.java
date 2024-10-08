// ATM INTERFACE USING JAVA

import java.util.*;
public class INTERFACE_ATM {
 public static void main(String[] args) {
    double BALANCE=150000;
    Scanner atm=new Scanner(System.in);
    while (true) {
        System.out.println("1:  CHECKING BALANCE\n2:  CASH DEPOSITE\n3:  CASH WITHDRAWAL\n4:  EXIT");
        System.out.print("PLEASE ENTER YOUR CHOICE:");
        int choice=atm.nextInt();
        switch(choice){
          case 1:
          System.out.println("CHECKING BALANCE:");
          System.out.println("TOTAL BALANCE:"+BALANCE+ "\n THANK YOU");
          break;
    case 2:
    System.out.println("PLEASE ENTER MONEY FOR DEPOSITING:");
           int Deposit =atm.nextInt();
           BALANCE=BALANCE+Deposit;
           System.out.println("SUCCESSFULLY DEPOSITED: \n THANK YOU:");
           break;

           case 3:
           System.out.println("ENTER YOUR MONEY FOR WITHDRAWAL:");
           int withdrawal=atm.nextInt();
           if (BALANCE>=withdrawal) {
            BALANCE=BALANCE-withdrawal;
            System.out.println("SUCCESSFULLY WITHDRAWAL\n THANK YOU:");
           }
           else{
            System.out.println("INSUFFUCIENT BALANCE \n THANK YOU:");
           }
           break;
           case 4:
           System.out.println("EXIT:\n THANK YOU");
           break;
        }

    }
 }  
    
}