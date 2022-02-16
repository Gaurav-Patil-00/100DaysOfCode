import java.io.*;
import java.util.*;
class TokenDemo{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String fullName = br.readLine();
		
		StringTokenizer st = new StringTokenizer(fullName , ",");
		String firstName = (st.nextToken()).trim();
		String middleName = (st.nextToken()).trim();
		String lastName = (st.nextToken()).trim();
		
		System.out.println(lastName+" "+firstName+" "+middleName);
	}
}