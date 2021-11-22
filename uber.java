import java.util.Arrays;

public class uber {
    static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;
         
        while (n != 1)
        {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }

    static int pair(int a[]) {
        int c=0;
        Arrays.sort(a);
        int sum=0;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 1; j < a.length; j++) {
                sum = a[i] + a[j];
                if(isPowerOfTwo(sum))
                    c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int a[] = {1, -1, 2, 3};   
        int n = uber.pair(a);
        System.out.println(n);       
    }
}