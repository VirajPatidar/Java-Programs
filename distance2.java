import java.util.Scanner;
class distance2 {
    int km;
    int m;
    static Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("Enter the distance in kilometers and meters");
        km = Integer.parseInt(sc.nextLine()); 
        m = Integer.parseInt(sc.nextLine());
    }
    void add(distance2 d1, distance2 d2){
        km = d1.km + d2.km + (d1.m + d2.m)/1000;
        m = (d1.m + d2.m)%1000;
        System.out.print("\nAfter Addition");
    }
    void sub(distance2 d1, distance2 d2){
        int diff = (d1.km*1000 + d1.m) - (d2.km*1000 + d2.m);
        diff = Math.abs(diff);
        km = diff / 1000;
        m = diff % 1000;
        System.out.print("After Subtraction");
    }
    void display(){
        System.out.println(" the resultant value of distance is: "+km+" km "+m+" m\n");
    }
    public static void main(String[] args) {
        distance2 d[] = new distance2[2];
        distance2 di = new distance2();
        for (int i = 0; i < d.length; i++) {
            d[i] = new distance2();
            d[i].input();
        }
        di.add(d[0],d[1]);
        di.display();
        di.sub(d[0],d[1]); 
        di.display();
        sc.close();
    }
}