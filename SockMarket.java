import java.util.Scanner;
class Solution{

static int sockMerchant(int n, int[] ar) {
        int count=0;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                if(i==j)
                    continue;
                else{
                    if(ar[i]==ar[j])
                        count++;
                }
            }  
        }

        return count;
}

public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] ar = new int[n];
	for(int i=0; i<=n; i++){
		ar[i] = sc.nextInt();
	}
	System.out.println(sockMerchant(n,ar));
}
}