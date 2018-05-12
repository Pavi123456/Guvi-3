import java.util.Scanner;

public class IndexAndValueSame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arrnew = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(i==arr[i])		
				System.out.println(arr[i]);
		}
		
	}

}
