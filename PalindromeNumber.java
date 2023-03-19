import java.util.*;
class PalindromeNumber
{
 public static void main(String[] args)
{
 int n,s,m=0,temp;
 System.out.println("Enter the Number");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 temp=n;
 while(n>0)
 {
  s=n%10;
  m=m*10+s;
  n=n/10;
}
 System.out.println("The Reverse of..."+n+"is.."+m);
 if(temp==m)
 {
  System.out.println("The Number is Palindrome");
 } 
 else
  System.out.println("The Number is not Palindrome");
}
}
