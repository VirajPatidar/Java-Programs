import java.util.Scanner;
abstract class employee {
    Scanner sc = new Scanner(System.in);
    String name;
    int empno;
    int experience;
    int salary=0;
    void input() {
        System.out.println("Enter employee Name, number and experience in order");
        name = sc.nextLine();
        empno = Integer.parseInt(sc.nextLine());
        experience = Integer.parseInt(sc.nextLine());
    }
    void display(){
        System.out.println("-----------------PAYSLIP------------------");
        System.out.println("Name: "+name+"\nNumber: "+empno+"\nExperience: "+experience+"\nSalary: "+salary);
        System.out.println("------------------------------------------");
    }
    abstract void calculateSalary();
}
class PermanentEmployee extends employee {
    void calculateSalary() {
        System.out.println("Enter Basic, Dearness Allowance and House Rent Allowance in order");
        for (int i = 0; i < 3; i++)
            salary = salary + Integer.parseInt(sc.nextLine());
    }
}
class ContractEmployee extends employee {
    void calculateSalary() {
        System.out.println("Enter Fixed pay amount and variable pay amount in order");
        for (int i = 0; i < 2; i++)
            salary = salary + Integer.parseInt(sc.nextLine());
    }
}
class Main {
    public static void main(String[] args) {
        PermanentEmployee ob1 = new PermanentEmployee();
        ob1.input();
        ob1.calculateSalary();
        ob1.display();
        ContractEmployee ob2 = new ContractEmployee();   
        ob2.input();
        ob2.calculateSalary();
        ob2.display();
    }
}