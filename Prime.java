import  java.util.Scanner;
class PrimeDemo{
	
	static boolean isPrime(int num){
		if(num ==1 )
			return false;
		else if(num ==2)
			return true;
		else if(num%2==0)
			return false;
		
		for(int i=3; i <= Math.sqrt(num); i+=2){
			if(num%i==0)
				return false;
		}
		
		return true;
				
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<=n; i++){
			if(isPrime(i))
				System.out.println(i+" : is Prime Number");
	
		}
	}
}