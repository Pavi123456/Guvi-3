import java.util.Scanner;

public class Set1Que5MappingAlphabetTointeger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		String strNum = sc.next();
		getMappingAlphabetToInteger(strNum);
	}

	private static void getMappingAlphabetToInteger(String str) {
		int[] arr = new int[str.length()];
		int[] dp = new int[str.length()];
		
		for(int i=0;i<str.length();i++) {
			arr[i] = Integer.parseInt(""+str.charAt(i));
		}
		
		dp[0] = 1;
		if(arr[0]*10 + arr[1] < 27)
			dp[1] = 2;
		else
			dp[1] = 1;
		
		for(int i=2;i<arr.length;i++) {
			long combinedLast2didgits=0;
			if(arr[i-1]*10 + arr[i] < 27)
				combinedLast2didgits=dp[i-2];
			dp[i]=(int) (dp[i-1]+combinedLast2didgits);	
		}
		System.out.println("Total mapping are:"+dp[dp.length-1]);
	}
}
