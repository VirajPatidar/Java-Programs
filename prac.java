public class prac {

    static int decToBinary(int n){
        if (n == 0)  
            return 0;    
        else
            return (n%2 + 10*decToBinary(n/2));
    } 
    public static void main(String[] args) {
        System.out.println(8>>1);
        System.out.println(-8>>1);
        System.out.println(8>>>1);
        System.out.println(-8>>>1);
    }    
}