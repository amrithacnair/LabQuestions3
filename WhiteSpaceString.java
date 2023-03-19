import java.util.*;
class WhiteSpaceString
{
 public static void main(String[] args)
{
 String str,str1;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the String");
 str=sc.nextLine();
 str1=str.replaceAll("\\s","");
 System.out.println("The New String is....."+str1);
}
}
