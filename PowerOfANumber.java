import java.util.*;
class PowerOfANumber
{
 public static void main(String[] args)
{
 int n,m,p=1;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter The Number");
 n=sc.nextInt();
 System.out.println("Enter The Power");
 m=sc.nextInt();
 int s=n;
 while(m!=0)
  {
   p=p*n;
   --m;
  }
 System.out.println("The Power of  "+s+"  is   "+p);
 }
}