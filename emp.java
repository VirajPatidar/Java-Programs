import java.util.Scanner;
public class emp {
    static Scanner sc = new Scanner(System.in);
    String name;
    String dept;
    int age;
    void read() {
        System.out.println("Enter employee Name, department and age in order");
        name = sc.nextLine();
        dept = sc.nextLine();
        age = Integer.parseInt(sc.nextLine());
    }
    void display(){
        System.out.println("Name: "+name+"    Department: "+dept+"    Age: "+age);
    }
    void compare(emp e1, emp e2) {
        int count = 0;
        if(e1.name.equals(e2.name)){
            System.out.println("Employee name is same");
            count++;
        }
        if(e1.dept.equals(e2.dept)){
            System.out.println("Employee dept is same");
            count++;
        }
        if(e1.age == e2.age){
            System.out.println("Employee age is same");
            count++;
        }
        if(count==3)
            System.out.println("Employee data of "+e1.name+ " is entered twice");
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of employees");
        int n = Integer.parseInt(sc.nextLine());
        emp e[] = new emp[n]; emp obj = new emp();
        for (int i = 0; i < e.length; i++) {
            e[i] = new emp();
            e[i].read();
        }
        System.out.println("\nEnter the indexes of two employees to compare");
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        obj.compare(e[a], e[b]);
        System.out.println("\n");
        for (int i = 0; i < e.length; i++)
            e[i].display();
    }
}