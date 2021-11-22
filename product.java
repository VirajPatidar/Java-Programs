import java.util.Scanner;
public class product {
    static Scanner sc = new Scanner(System.in);
    int id;
    float cost;
    product(int i){
        System.out.println("Enter the id of product " + (i+1));      
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the cost of product " + (i+1));      
        cost = Float.parseFloat(sc.nextLine());
    }
    void display(){
        System.out.println("Id: "+id+"  Cost: "+cost);
    }
    void increment(){
        cost = cost + 1000;
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of products you want to store");
        n = Integer.parseInt(sc.nextLine());
        product p[] = new product[n];
        for(int i = 0; i < p.length; i++)
            p[i] = new product(i);
        for(int i = 0; i < p.length; i++)
            p[i].display();
        for(int i = 0; i < p.length; i++)
            p[i].increment();
        product temp;
        for (int i = 1; i < p.length; i++) {
            for (int j = i; j > 0; j--) {
                if (p[j].cost > p[j - 1].cost) {
                    temp = p[j];
                    p[j] = p[j - 1];
                    p[j - 1] = temp;
                }
            }
        }
        System.out.println("\nAfter incremnting and sorting");
        for(int i = 0; i < p.length; i++)
        p[i].display();
    }    
}