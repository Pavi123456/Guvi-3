import java.util.Scanner;

public class OneArrSubSetOfAnother {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size for Array1: ");
		int n = sc.nextInt();
		String result = "";
		int i=0,j=0;
		int arr[] = new int[n];
		
		for(i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the size for Array2: ");
		int m = sc.nextInt();
		int[] arrnew = new int[m];
		for(i=0;i<arrnew.length;i++) {
			arrnew[i] = sc.nextInt();
		}
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arrnew.length;j++) {
				if(arr[i] == arrnew[j]) {
					break;
				}
			}
			if(j==arrnew.length)
				result="No";
			else
				result="Yes";
		}
		System.out.println(result);
	}

}
