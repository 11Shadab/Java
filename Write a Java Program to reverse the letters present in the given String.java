import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("enter the string");
     String s=sc.next();
     String str="";
     for(int i=s.length()-1;i>=0;i--){
         str=str+s.charAt(i);
     }
     System.out.print("reverse string is: "+str);
 	}
}
