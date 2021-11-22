import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

class item {
    String name;
    int quantity, price;

    item(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

public class exp2 {
    public static void main(String[] args) throws IOException {
        ArrayList<item> list = new ArrayList<item>();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        int q, p;
        System.out.println("1:Add\n2:Remove\n3:Display\n4:Calculate Bill\n5:Sort the list\n6:Exit");
        Iterator<item> itr;
        do {
            System.out.println("");
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Enter Name of the item:");
                name = br.readLine();
                System.out.println("Enter Price of the item:");
                p = sc.nextInt();
                System.out.println("Enter Quantity of the item:");
                q = sc.nextInt();
                item i = new item(name, q, p);
                list.add(i);
                break;
            case 2:
                System.out.println("Enter the name of item to be removed");
                name = br.readLine();
                itr = list.iterator();
                int f = 1;
                while (itr.hasNext()) {
                    i = itr.next();
                    if (i.name.equalsIgnoreCase(name)) {
                        list.remove(i);
                        f = 0;
                    }
                }
                if (f == 1) {
                    System.out.println("Item Does Not Found");
                } else {
                    System.out.println("Item Removed");
                }
                break;
            case 3:
                itr = list.iterator();
                while (itr.hasNext()) {
                    i = itr.next();
                    System.out.println("Name:" + i.name + "  Price:" + i.price + " Quantity:" + i.quantity);
                }
                break;
            case 4:
                itr = list.iterator();
                double total = 0.0;
                while (itr.hasNext()) {
                    i = itr.next();
                    total += i.price * i.quantity;
                }
                System.out.println("Total Amount:" + total);
                break;
            case 5:
                itr = list.iterator();
                while (itr.hasNext()) {
                    item j;
                    i = itr.next();
                    Iterator itr2 = list.iterator();
                    while (itr2.hasNext()) {
                        j = (item) itr2.next();
                        if (i.price > j.price && (list.indexOf(i) < list.indexOf(j))) {
                            Collections.swap(list, list.indexOf(i), list.indexOf(j));
                        }
                    }
                }
                break;
            }
        } while (choice != 6);
    }
}
