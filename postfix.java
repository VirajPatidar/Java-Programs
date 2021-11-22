import java.util.*; 
class postfix {
    static int precedence(char ch) 
    { 
        switch (ch) 
        { 
            case '+': 
            case '-': 
                return 1; 
            case '*': 
            case '/': 
                return 2; 
            case '^': 
                return 3; 
        } 
        return -1; 
    }  
    static String infixToPostfix(String exp){ 
        String result = new String(""); 
        Stack<Character> stack = new Stack<>(); 
        for (int i = 0; i<exp.length(); ++i){ 
            char c = exp.charAt(i);  
            if (Character.isLetterOrDigit(c)) 
                result += c; 
            else if (c == '(') 
                stack.push(c); 
            else if (c == ')'){ 
                while (!stack.isEmpty() && stack.peek() != '(') 
                    result += stack.pop(); 
                  
                if (!stack.isEmpty() && stack.peek() != '(') 
                    return "Invalid Expression"; // invalid expression                 
                else
                    stack.pop(); 
            } 
            else{ 
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())){ 
                    if(stack.peek() == '(') 
                        return "Invalid Expression"; 
                    result += stack.pop(); 
                } 
                stack.push(c); 
            } 
       
        } 
        while (!stack.isEmpty()){ 
            if(stack.peek() == '(') 
                return "Invalid Expression"; 
            result += stack.pop(); 
         } 
        return result; 
    }  
    public static void main(String[] args){
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the infix expression to get its postfix form");
        String exp = sc.nextLine(); 
        System.out.println(infixToPostfix(exp));
        sc.close();
    } 
}