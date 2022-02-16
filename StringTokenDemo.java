import java.util.*;
import java.io.*;
class StringTokenizerDemo{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String empDetail = br.readLine();
		
		StringTokenizer st = new StringTokenizer(empDetail,",");
		int token1 = (Integer.parseInt(st.nextToken())).trim();
		String token2 = (st.nextToken()).trim();
		double token3 = (Double.parseDouble(st.nextToken())).trim();
		
		
		System.out.println("Emp id : "+token1);
		System.out.println("Emp Name : "+token2);
		System.out.println("Emp Salary : "+token3);
	}
}