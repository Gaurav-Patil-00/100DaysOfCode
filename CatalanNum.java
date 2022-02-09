import java.util.Scanner;

public class CatalanNum {

    int findCatalan(int n) {
        int res = 0;

        if (n <= 1) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            res += findCatalan(i)
                    * findCatalan(n - i - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Catalan Numbers to be printed : ");
        int n = sc.nextInt();
        CatalanNum cn = new CatalanNum();
        sc.close();
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(cn.findCatalan(i) + " ");
        }
    }
}
