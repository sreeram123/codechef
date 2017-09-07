import java.util.Scanner;
import java.text.DecimalFormat;
class ATM{
  public static void main(String args[])
  {
    int withdraw;
    double bal;
    Scanner sc=new Scanner(System.in);
    withdraw=sc.nextInt();
    bal=sc.nextDouble();
    if(withdraw%5!=0)
    System.out.println(bal);
    else if (withdraw>=bal)
    System.out.println(bal);
    else
    bal=bal-withdraw;
    bal=bal-0.5;
    DecimalFormat numberFormat = new DecimalFormat("#.00");
    System.out.println(numberFormat.format(bal));
  }
}
