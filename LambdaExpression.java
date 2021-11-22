import java.util.*;

interface Operate{  
    int operate(int a,int b);  
}  
  
public class LambdaExpression{  
    public static void main(String[] args) {  
          
        Operate o1=(a,b)->(a+b);  
        System.out.println(o1.operate(10,20));
          
        Operate o2=(a,b)->(a*b);  
        System.out.println(o2.operate(10,20));
          
        Operate o3=(a,b)->(a-b);  
        System.out.println(o3.operate(10,20));
          
        Operate o4=(a,b)->(a/b);  
        System.out.println((int)o4.operate(10,20));

        List<Integer> list=new ArrayList<Integer>();  
        list.add(1);  
        list.add(2);  
        list.add(3);  
        list.add(4);  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  