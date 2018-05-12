import java.util.Scanner;

public class EvenPositionOddPositionEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0 && i%2!=0)
				print(arr[i]);
			else if(arr[i]%2!=0 && i%2==0)
				print(arr[i]);
		}
	}

	private static void print(int i) {
		System.out.println(i);
	}

}
