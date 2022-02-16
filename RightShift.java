class RightShiftDemo{
	public static void main(String[] args){
		//for positive number
		int num1 = 75;
		int num2 = 125;

		int res1 = 0;

		res1 = num1 >> 2;
		System.out.println(res1); //5
	
		res1 = num2 >> 5;
		System.out.println(res1); //3

		//for negative number
		int num3 = -38;
		int num4 = -125;

		int res2 = 0;
		
		res2 = num3 >> 4;
		System.out.println(res2); //-6

		res2 = num4 >> 5;
		System.out.println(res2); //-4
	}
}