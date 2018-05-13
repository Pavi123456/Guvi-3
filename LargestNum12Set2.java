package HunterSet2;
import java.util.Arrays;
import java.util.Scanner;

public class LargestNum12Set2 {
	public static void main(String[] args) {
		int result=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the Kth searched Element: ");
		int k = sc.nextInt();
		Arrays.sort(arr);
		if(n>k) {
			for(int i=0;i<k;i++) {
				result = arr[i];
			}
			System.out.println(result);
		}
	}
}
