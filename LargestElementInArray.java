import java.util.*;
class LargestElementInArray
{
 public static void main(String[] args)
 {
   int n,s=0,i,t,j;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the limit of array");
   n=sc.nextInt();
   int a[]=new int[n];
   System.out.println("Enter the Elements");
   for(i=0;i<a.length;i++)
   {
    a[i]=sc.nextInt();
   }
for(i=0;i<a.length;i++)
 {
   for(j=i+1;j<a.length;j++)
    {
     if(a[i]<a[j])
      {
        t=a[i];
       a[i]=a[j];
       a[j]=t;
      }
    }
 }
System.out.println("The Array in Descending order");
 for(i=0;i<a.length;i++)
  {
    System.out.println(a[i]);
  }
 System.out.println("Largest Element is ............"+a[0]);
}
}
  