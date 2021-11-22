import java.util.Scanner;
public class student2{
    int rollNo; int total=0;
    double percentage;
    String Name;
    static Scanner sc = new Scanner(System.in);
    void getInfo(){
        System.out.println("Enter student roll number, Name, and PCMBE Marks in order");
        rollNo = Integer.parseInt(sc.nextLine()); 
        Name = sc.nextLine();
        for (int i=1; i<=5; i++)
            total += Integer.parseInt(sc.nextLine());
    }
    void calcPercentage(int totalMarks){
        percentage = (double)totalMarks/500*100;
    }
    void display(){
        System.out.println("------------------------");
        System.out.println("Name: "+Name+"\nRoll Number: "+rollNo+"\nTotalMarks: "+total+"\nPercentage score: "+percentage);
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        student2 s1 = new student2();
        s1.getInfo(); s1.calcPercentage(s1.total); s1.display();
        sc.close();
    }
}