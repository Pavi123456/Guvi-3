import java.util.HashSet;
import java.util.Scanner;

public class RepeatedNumber {
	private static void print(int i) {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					print(arr[i]);
				
			}
		}
	}
}
