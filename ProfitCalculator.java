import java.util.Scanner;
public class ProfitCalculator{
	
	static void profitCal(long pA, double per,int days){
		long profit = 0;
		long sum =0;
		int temp = days;
		while(temp>0){
			sum = profit+ pA; 
			profit = Math.round(5*sum*per/100);
			
			temp--;
		}
		System.out.print("Profit for "+days+" days : "+ profit);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your investment amount : ");
		long principalAmount = sc.nextLong();
		System.out.println("Enter the % margin : ");
		double margin = sc.nextDouble();
		System.out.print("Compounding For how many days :  ");
		int days = sc.nextInt();
		
		profitCal(principalAmount, margin, days);
		
	}
}