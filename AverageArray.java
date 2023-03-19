import java.util.*;
class AverageArray
{
 public static void main(String[] args)
 {
   int n,s=0,i;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the limit of array");
   n=sc.nextInt();
   int a[]=new int[n];
   System.out.println("Enter the Elements");
   for(i=0;i<n;i++)
   {
    a[i]=sc.nextInt();
   }
   for(i=0;i<n;i++)
   {
    s=s+a[i];
   }
   System.out.println("The Sum is...."+s);
 }
}
  