import java.util.Scanner;
class ReverseProgram
{
 public static void main(String[] args)
{
 int m,n,t=0,c;
 System.out.println("Enter the  number:");
 Scanner sc=new Scanner(System.in);
 m=sc.nextInt();
 c=m;
 while(m>0)
 {
  n=m%10;
  t=t*10+n;
  m=m/10;
 }
System.out.println("The Reverse is...."+t);
}
}
  
