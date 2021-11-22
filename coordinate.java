import java.util.Scanner;
class coordinate {
    double x;
    double y;
    void set(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinates");
        x = Double.parseDouble(sc.nextLine()); 
        y = Double.parseDouble(sc.nextLine());
    }
    void distance(coordinate pt2,coordinate pt1) {
        double dis = Math.sqrt((pt2.x-pt1.x)*(pt2.x-pt1.x) + (pt2.y-pt1.y)*(pt2.y-pt1.y));
        System.out.println("The distance between the co-ordinates is: "+ dis);
    }
    public static void main(String[] args) {
        coordinate ob1 = new coordinate();
        coordinate ob2 = new coordinate();
        ob1.set();
        ob2.set();
        ob2.distance(ob2, ob1);
    }
}