class Pattern3Demo{
	public static void main(String[] args){
		int count=1;
		for(int i=1; i<=3; i++){
			int j=1;
			while(j<=3){
				int x = count++;
				System.out.print(x*x + " ");
				j++;
			}
			System.out.println();
		}
	}
}