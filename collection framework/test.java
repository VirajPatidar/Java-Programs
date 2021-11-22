import java.util.*;
 
public class test {
     public static void main(String[] a)
{
        ArrayList<String> al = new ArrayList<String>();
        al.add("JAVA"); //add elements to the ArrayList
        al.add("C++");
        al.add("PERL");
        al.add("PHP");
        System.out.println(al); //get elements by index
        System.out.println("Element at index 1: "+al.get(1));
        System.out.println("Does list contains JAVA? "+al.contains("JAVA"));
        al.add("PERL");
        System.out.println(al); 
        //Display elements through Iterator Interface
       Iterator<String> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        al.add(2,"PLAY"); //add elements at a specific index
        System.out.println("Is arraylist empty? "+al.isEmpty());
        System.out.println("Index of PERL is "+al.indexOf("PERL"));
        System.out.println("Size of the arraylist is: "+al.size());
    }
}