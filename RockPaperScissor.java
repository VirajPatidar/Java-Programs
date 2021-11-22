import java.util.*;
public class RockPaperScissor {
    int user_score; int cpu_score;
    static Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    boolean check(int user,int cpu){
        if(user == 0 && cpu == 2)
            return(true);
        else if(user > cpu)
            return(true);
        else if(user == 2 && cpu == 0)
            return(false);
        else
            return(false);
    }
    void game(){
        System.out.println("Enter your move : Rock 0, Paper 1, Scissor 2");
        int user = Integer.parseInt(sc.nextLine());
        int random = rand.nextInt(3);
        if(user == random){
            System.out.println("user: "+user+" CPU: "+random);
            System.out.println("DRAW");System.out.println("");
        }
        else if(check(user, random)){
            System.out.println("user: "+user+" CPU: "+random);
            System.out.println("USER WINS");System.out.println("");
            user_score++;
        }
        else{
            System.out.println("user: "+user+" CPU: "+random);
            System.out.println("CPU WINS");System.out.println("");
            cpu_score++;
        }      
    }
    void display(){
        System.out.println("-----------------------------");
        System.out.println("The Final Score is "+user_score+" | "+cpu_score);
        System.out.println("-----------------------------");
        System.out.println("Thanks for playing !!");
    }
    public static void main(String[] args) {
        RockPaperScissor r = new RockPaperScissor();
        char choice;
        while (true) {
            System.out.println("Rock Paper Scissors ? Y/N");
            choice = sc.nextLine().charAt(0);
            if(choice == 'Y'|| choice =='y')
                r.game();
            else{
                r.display();
                break;
            }
        }
    }
}