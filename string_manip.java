import java.util.Scanner;
class string_manip {
    int check(char ch){
        int flag;
        switch (ch) {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':flag =1;
                     break;
            default:flag =0;
                    break;
        }
        return flag;
    }
    void vowel(String str){
        String s = "" ;
        for (int i = 0; i < str.length(); i++)
            if(check(str.charAt(i))==0)
                s = s + str.charAt(i);            
        System.out.println("The string after removing vowels is: "+s);
    }

    void reverse(String str){
        String s = "";
        str = str.trim();
        str = " " + str; 
        int ptr = str.length();
        for (int i = str.length()-1; i >= 0; i--){
            if(str.charAt(i)==' '){
                s = s + str.substring(i+1, ptr) + " ";
                ptr = i;
            }
        }
        System.out.println("The reversed string is: "+ s);
    }
    public static void main(String[] args) {
        string_manip ob = new string_manip();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to remove its vowels: ");
        String str = sc.nextLine();
        ob.vowel(str);
        System.out.println();
        System.out.print("Enter a string to reverse: ");
        str = sc.nextLine();
        ob.reverse(str);
        System.out.println();
    }
}