import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class exp3 {
    String name, branch;
    int rollno, year;

    exp3(String name, String branch, int rollno, int year) {
        this.name = name;
        this.branch = branch;
        this.rollno = rollno;
        this.year = year;
    }

    public static void main(String[] args) throws IOException {
        String name, branch;
        int rollno, year, choice = 0;

        Hashtable<Integer, exp3> ht = new Hashtable<Integer, exp3>();
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1:Insert record\n2:Remove record\n3:Display all records\n4:Exit\n");
        do {
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Enter name of Student:");
                name = br.readLine();
                System.out.println("Enter Branch of student:");
                branch = br.readLine();
                System.out.println("Enter Roll no of student:");
                rollno = sc.nextInt();
                System.out.println("Enter year of Admission:");
                year = sc.nextInt();
                exp3 s = new exp3(name, branch, rollno, year);
                ht.put(rollno, s);
                System.out.println();
                break;

            case 2:
                System.out.println("Enter Roll no of student whose record is to be deleted:");
                int roll = sc.nextInt();
                if (ht.containsKey(roll)) {
                    ht.remove(roll);
                    System.out.println("Record Deleted");
                } else {
                    System.out.println("Record Does not found");
                }
                System.out.println();
                break;

            case 3:
                Enumeration e = ht.elements();
                if (e.hasMoreElements()) {
                    while (e.hasMoreElements()) {
                        exp3 se = (exp3) e.nextElement();
                        System.out.println("Name:" + se.name + " branch:" + se.branch + " Roll no:" + se.rollno + " Year of admission:" + se.year);
                    }
                } else {
                    System.out.println("Plaese insert sone records");
                }
                System.out.println();
                break;
            }

        } while (choice != 4);
    }
}
