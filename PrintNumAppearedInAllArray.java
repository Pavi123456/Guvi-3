package HunterSet2;
import java.util.Scanner;

public class PrintNumAppearedInAllArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int m = sc.nextInt();
		System.out.print("Enter the new Array size: ");
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int j=1;j<m;j++) {
			for(int p=0;p<n;p++) {
				for(int k=0;k<n;k++) {
					if(arr[0][p]==arr[j][k]) {
						System.out.print(arr[j][k]+" ");
					}
				}
			}
		}
	}

}
