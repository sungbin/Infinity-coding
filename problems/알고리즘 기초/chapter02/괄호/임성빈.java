import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        
        for(int i= 1; i<= T; i++) {
            String str = in.nextLine();
            Stack<Character> stack = new Stack<>();
            try {
                for(char ch : str.toCharArray()) {
                    if(ch == '(')
                        stack.push(ch);
                    else if(ch == ')') {
                           stack.pop();
                    }
                }
                if(stack.empty()) {
                System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } catch(Exception e) {
                    System.out.println("NO");
            }
            
        }
    }
}
