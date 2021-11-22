import java.util.Scanner;
public class student1 {
    int rollNo; int totalMarks;
    double percentage;
    String Name; String Branch;
    static Scanner sc = new Scanner(System.in);
    void getInfo(){
        System.out.println("Enter student roll number, Name, Total marks & Branch in order");
        rollNo = Integer.parseInt(sc.nextLine()); 
        Name = sc.nextLine();
        totalMarks = Integer.parseInt(sc.nextLine());
        Branch = sc.nextLine();
    }
    void calcPercentage(int totalMarks){
        percentage = (double)totalMarks/500*100;
    }
    void display(){
        System.out.println("------------------------");
        System.out.println("Name: "+Name+"\nRoll Number: "+rollNo+"\nBranch: "+Branch+"\nTotalMarks: "+totalMarks+"\nPercentage score: "+percentage);
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        student1 s1 = new student1(); student1 s2 = new student1();
        s1.getInfo(); s1.calcPercentage(s1.totalMarks); s1.display();
        s2.getInfo(); s2.calcPercentage(s2.totalMarks); s2.display();
        sc.close();
    }
}