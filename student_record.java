import java.util.Scanner;
class student_record {
    float student[][];
    void getRecord(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students for which record is to be created");
        int n = Integer.parseInt(sc.nextLine());
        student = new float[n][];
        for (int i=0; i<student.length; i++){
            System.out.println("Enter the number of online courses completed by student "+(i+1)+": ");
            int c = Integer.parseInt(sc.nextLine());
            student[i] = new float[c];
            for(int j=0; j<student[i].length; j++){
                System.out.println("Enter the marks obtained by student "+(i+1)+" in course No. "+j+": ");
                student[i][j] = Float.parseFloat(sc.nextLine());
            }
        }
        sc.close();
    }
    void calculate(){
        float sum = 0, percentage, avgp, sump=0;
        System.out.println("Student Index     Percentage");
        for (int i=0; i<student.length; i++){
            sum = 0;
            for(int j=0; j<student[i].length; j++){
                sum = sum + student[i][j];
            }
            percentage = sum/student[i].length;
            System.out.println("       "+(i+1)+"       |     " + percentage);
            sump = sump + percentage;
        }
        avgp = sump/student.length;
        System.out.println("\nAverage Percentage of all the students is: "+avgp);
    }
    public static void main(String[] args) {
        student_record ob = new student_record();
        ob.getRecord();
        ob.calculate();
    }
}