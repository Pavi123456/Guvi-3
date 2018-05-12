import java.util.Scanner;

public class NotRepeatedNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pp = 0;
		int n = sc.nextInt();
		int[] arr = new int[n];
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
			System.out.println(print(arr,arr.length));
		
	}

	private static int print(int[] arr, int i) {
		int res = arr[0];
        for (int k = 1; k < i; k++)
            res = res ^ arr[k];	
        
        return res;
	}
}
