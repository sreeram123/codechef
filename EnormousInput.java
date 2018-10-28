import java.util.Scanner;
class EnormousInput{
  public static void main(String args[])
  {
    j
    long m,div,n;
    int c=0;
    Scanner sc=new Scanner(System.in);
    m=sc.nextLong();
    div=sc.nextLong();
    for(int i=0;i<m;i++)
    {
      n=sc.nextLong();
      if(n%div==0)
      c++;
    }
    System.out.println(c);
  }
}
