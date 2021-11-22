import java.util.Scanner;
class distance {
    int km;
    int m;
    static Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("Enter the distance in kilometers and meters");
        km = Integer.parseInt(sc.nextLine()); 
        m = Integer.parseInt(sc.nextLine());
    }
    void add(distance d1, distance d2){
        km = d1.km + d2.km + (d1.m + d2.m)/1000;
        m = (d1.m + d2.m)%1000;
        System.out.print("\nAfter Addition");
    }
    void sub(distance d1, distance d2){
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
        distance d = new distance(); distance d1 = new distance(); distance d2 = new distance();
        d1.input(); d2.input();
        d.add(d1,d2);
        d.display();
        d.sub(d1,d2); 
        d.display();
        sc.close();
    }
}