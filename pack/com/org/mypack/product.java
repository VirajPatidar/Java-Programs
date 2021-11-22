package com.org.mypack;
import java.util.Scanner;
public class product {
    String name;
    double CP;
    double SP;
    Scanner sc = new Scanner(System.in);
    public product() {
        input();
    }
    public void input() {
        System.out.println("Enter the product name");
        name = sc.nextLine();
        System.out.println("Enter the CP and SP");
        CP = Double.parseDouble(sc.nextLine());
        SP = Double.parseDouble(sc.nextLine());
        //sc.close();
    }
    public double difference() {
        double diff = SP-CP;
        if(diff>0)
            System.out.println("Profit for this product is: "+diff);
        else if(diff<0)
            System.out.println("Loss for this product is: "+(-diff));
        else
            System.out.println("No Loss nor Profit for this product");
        return diff;
    }    
}