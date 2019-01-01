class Main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		java.util.Stack<Integer> stack = new java.util.Stack<Integer>(); 
		
		int T = in.nextInt();
		
		for(int i=1; i<=T; i++) {
			String word = in.next();
			switch(word) {
			case "push":
				int n = in.nextInt();
				stack.push(n);
				break;
			case "pop":
				try {
					System.out.println(stack.pop());
				} catch(Exception e) {System.out.println("-1");}
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				if(stack.empty())
					System.out.println("1");
				else
					System.out.println("0");
				break;
			case "top":
				try {
					System.out.println(stack.peek());
				} catch(Exception e) {System.out.println("-1");}
				break;
			}
		}
	}
}
