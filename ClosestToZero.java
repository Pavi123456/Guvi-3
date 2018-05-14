import java.util.Scanner;

public class ClosestToZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tmp1=9999,tmp2=-9999,a1=0,a2=0,b1=0,b2=0;
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]+arr[j])>0) {
					if((arr[i]+arr[j])<tmp1) {
						tmp1 = arr[i] + arr[j];
						a1 = arr[i];
						a2 = arr[j];
					}
				}
				if((arr[i]+arr[j])<0) {
					if((arr[i]+arr[j])>tmp2) {
						tmp2 = arr[i] + arr[j];
						b1 = arr[i];
						b2 = arr[j];
					}
				}
			}
		}
		if(tmp1+tmp2<0)
			System.out.println(a1+" "+a2);
		else
			System.out.println(b1+" "+b2);
	}

}
