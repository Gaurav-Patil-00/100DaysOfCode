class Pattern2Demo{
	public static void main(String[] args){
		int count=1;
		for(int i=1; i<=4; i++){
			int j=1;;
			while(j<=4){
				System.out.print(count++ + " ");
				j++;
			}
			System.out.println();
		}
	}
}