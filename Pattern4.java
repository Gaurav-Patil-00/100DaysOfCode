class Pattern4Demo{
	public static void main(String[] args){
		int x = 3;
		int s = 0;
		for (int i=0;i<3;i++){
			for(int j=0; j<3; j++){
				System.out.print(s + " ");
				s = s + x;
				x = x + 2;
			}
			System.out.println();
			
		}
	}
}
