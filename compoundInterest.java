import java.lang.Math;
public class compoundInterest {
    public void calc(int p, int t, double r, int n) {
        double amount = p * Math.pow(1 + (r / n), n * t);
        System.out.println("Compound Interest after " + t + " years is: "+(amount - p));
        System.out.println("Amount after " + t + " years is: "+amount);
    }
    public static void main(String args[]) {
    	compoundInterest obj = new compoundInterest();
    	obj.calc(1000, 5, .05, 12);
    }
}