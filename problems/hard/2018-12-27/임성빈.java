import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		String intput = "3\n" + "3\n" + "10 7 6\n" + "3\n" + "3 5 9\n" + "5\n" + "1 1 3 1 2";
		/*
		3
    	3
    	10 7 6
    	3
    	3 5 9
    	5
    	1 1 3 1 2
		*/
		
		InputStream stream = new ByteArrayInputStream(intput.getBytes(StandardCharsets.UTF_8));
		Scanner in = new Scanner(stream);

		int T = in.nextInt();
		for(int i = 1; i<=T; i++) {
			int n = in.nextInt();
			int[] ints = new int[n];
			int total_profit = 0;
			for(int j=0; j< n; j++)
				ints[j] = in.nextInt();
			
			for(int j=0; j<n; j++) {
				int max = getMax(ints,j); //나머지 부분에서 최대 이익을 볼 수 있는 가격을 가져옴 
				int profit = max - ints[j];
				total_profit += profit;
			}
			
			System.out.println("#"+i+" "+total_profit);
		}

	}
	
	static int getMax(int[] ints, int n) {
		int max = 0;
		
		for(int i=n; i<ints.length; i++) {
			if(max<ints[i])
				max = ints[i];
		}
		
		return max == 0? ints[n]:max; //더 비싸게 못팔면 현재 가격으로 리턴 
	}
}