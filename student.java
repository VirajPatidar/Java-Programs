import java.util.Scanner;
public class student{
    int rollNo; int total, p, c, m;
    double percentage;
    String Name;
    static Scanner sc = new Scanner(System.in);
    student(){
        getInfo();
        total = p+c+m;
        calcPercentage(total);
        display();
    }
    student(String str, int r, int p, int c, int m) {
        rollNo = r;
        Name = str;
        total = p+c+m;
        calcPercentage(total);
        display();
    }
    void getInfo(){
        System.out.println("Enter student roll number, Name, and PCM Marks in order");
        rollNo = Integer.parseInt(sc.nextLine()); 
        Name = sc.nextLine();
        p = Integer.parseInt(sc.nextLine());
        c = Integer.parseInt(sc.nextLine());
        m = Integer.parseInt(sc.nextLine());
    }
    void calcPercentage(int totalMarks){
        percentage = (double)totalMarks/300*100;
    }
    void display(){
        System.out.println("------------------------");
        System.out.println("Name: "+Name+"\nRoll Number: "+rollNo+"\nTotalMarks: "+total+"\nPercentage score: "+percentage);
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        student s1 = new student();
        System.out.println("\nUsing parameterized constuctor");
        student s2 = new student("Ram",191001,93,85,74); 
        sc.close();
    }
}