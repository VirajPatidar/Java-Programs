import java.util.Scanner;
public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(sc.nextLine());
            int factorial = 1;
            for (int j = 1; j <= n; j++)
                factorial = factorial * j;
            System.out.println(factorial);            
        }
    } 
}