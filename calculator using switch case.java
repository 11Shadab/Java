import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the option 1 for addition 2 for subtraction 3 for multiplication 4 for division");
		int option=sc.nextInt();
		float num1=sc.nextInt();
		float num2=sc.nextInt();
		float result=0;
		switch(option){
		    case 1:
		        result=num1+num2;
		        System.out.println(result);
		        break;
		    case 2:
		        result=num1-num2;
		        System.out.println(result);
		        break;
		    case 3:
		        result=num1*num2;
		        System.out.println(result);
		        break;
		    case 4:
		        result=num1/num2;
		        System.out.println(result);
		        break;
		    default:
		    System.out.println("not a valid option! please choose a valid option ");
		}
		
	}
}
