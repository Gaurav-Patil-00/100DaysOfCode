class Mall{
	static class KFC{
		void kfc(){
			System.out.println("Food and Beverages");
		}
	}	
	static class HandM{
		void hm(){
			System.out.println("Fashion Brand");	
		}
	}
	class Unicorn{
		void apple(){
			System.out.println("Mobiles and other Electronics");
		}	
	}
}
class Customer{
	public static void main(String[] args){
		Mall.KFC per1 = new Mall.KFC();
		per1.kfc();	
		
		Mall per = new Mall();
		Mall.Unicorn per2 = per.new Unicorn();
		per2.apple(); 
	}	
}