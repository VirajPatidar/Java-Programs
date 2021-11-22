import java.lang.Math;
public class prime {
    public static void main(String[] args) {
        int low = 100, L , high = 200;
        while (low < high) {
            boolean flag = true;
            L = Math.abs(low);
            for(int i = 2; i <= L/2; i++) {
                if(L % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag && low != 0 && low != 1 && low != -1)
                System.out.print(low + " ");
            low++;
        }
        System.out.println("");
    }
}