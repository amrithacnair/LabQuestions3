import java.util.*;
class PrimeNumber
{
  public static void main(String[] args)
  {
   int n,d,c=0;
   System.out.println("Enter the Number");
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   for(int i=2;i<n;i++)
    {
      d=n%i;
      if(d==0)
       {
        c++;
       }
    }
   if(c!=0)
     System.out.println("The Number   "+n+"  is not Prime  ");
   else
     System.out.println("The Number   "+n+"  is Prime  ");
   }
}
