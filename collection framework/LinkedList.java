import java.util.*;
class LinkedList_1 {
    static Scanner sc = new Scanner(System.in);
    void menu() {
        System.out.println("1: Add a name");
        System.out.println("2: Remove first name");
        System.out.println("3: Remove last name");
        System.out.println("4: Get name from index");
        System.out.println("5: Get index from name");
        System.out.println("6: Display");
        System.out.println("7: Display using Iterator");
        System.out.println("8: Return Hashcode");
        System.out.println("9: Exit");
        System.out.println("");
    }
    public static void main(String[] args) {
        LinkedList<String> ll =new LinkedList<String>();
        LinkedList_1 l = new LinkedList_1(); 
        l.menu();
        int key = 0;
        while (key!=5) {
            key = Integer.parseInt(sc.nextLine());
            switch (key) {
                case 1:
                    String s = sc.nextLine();
                    ll.add(s);
                    System.out.println(ll);
                    break;

                case 2:
                    ll.removeFirst();
                    System.out.println(ll);
                    break;

                case 3:
                    ll.removeLast();
                    System.out.println(ll);
                    break;

                case 4:
                    int n = Integer.parseInt(sc.nextLine());
                    System.out.println(ll.get(n));
                    break;

                case 5:
                    String s1 = sc.nextLine();
                    System.out.println(ll.indexOf(s1));
                    break;

                case 6:
                    System.out.println(ll);
                    break;

                case 7:
                    Iterator itr = ll.listIterator();   
                    while(itr.hasNext()){  
                        System.out.println(itr.next());  
                    }   
                    break;

                case 8:
                    System.out.println(ll.hashCode());
                    break;

                case 9:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }
    }
}