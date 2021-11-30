import java.util.Scanner;
public class Main
{
    public static int factofn(int n)
    {
          if(n==0)
        return 1;
        else 
        return n*factofn(n-1);
        
    }
    public static int factofr(int r)
    {
          if(r==0)
        return 1;
        else 
        return r*factofn(r-1);
        
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the value of n: ");
		int n=sc.nextInt();
		System.out.print("enter the value of r: ");
		int r=sc.nextInt();
		factofn(n);
		int num=n-r;
		int fact=1; 
        for(int i=1;i<=num;i++) 
        {    
          fact=fact*i;    
        }   
        int permutation=factofn(n)/fact;
		int combination=factofn(n)/(factofr(r)*fact);
		System.out.println("permutation is: "+permutation+" "+"combination is: "+combination);
	}
}
