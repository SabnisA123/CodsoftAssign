import java.util.*;
class AtmInterface
{
  public static void main(String [] args)
  {
    int balance=20000,withdraw,deposite,num;
    Scanner sc = new Scanner(System.in);
    while(true)
    {
       System.out.println("Welcome to ATM Machine");
       System.out.println("1.Withdraw");
       System.out.println("2.Deposite");
       System.out.println("3.check Balance");
       System.out.println("4.Exit");
       num=sc.nextInt();
       switch(num)
       {
          case 1:
                System.out.println("Enter Amount to withdraw");
                withdraw=sc.nextInt();
                if(balance>=withdraw)
                {
                   balance=balance-withdraw;
                   System.out.println("Balance Amount is: " +balance);
                   System.out.println("Please collect your money");
                }
                else
                  {
                       System.out.println("you don't have enough money for withdraw");
                  }
                    System.out.println(" ");
                    break;
           case 2:
                System.out.println("Enter Amount to deposite");
              deposite=sc.nextInt();
              balance =balance+deposite;        
              System.out.println("Balance Amount is: " +balance);
               System.out.println("money has deposited successfully!!");
                  System.out.println(" ");
                    break;
                case 3:
                       System.out.println("balance of your account is :"+balance);
                        System.out.println(" ");
                          break;
               case 4:
                        System.exit(0);
                       System.out.println(" ");
       
    
    }
}
}
}



    
    
