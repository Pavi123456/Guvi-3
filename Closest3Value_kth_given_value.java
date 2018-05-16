package HunterSet2;
import java.util.Scanner;

public class Closest3Value_kth_given_value {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number for searching: ");
		int searchedElement = sc.nextInt();
		System.out.print("Enter the number for finding how many nearest value: ");
		int numOfNearest = sc.nextInt();
		closestprint(arr, searchedElement, numOfNearest, arr.length);
	}

	private static int searchingleftRight(int[] arr, int low, int high, int k) {
		if(arr[high] <= k)
			return high;
		if(arr[low] > k)
			return low;
		
		int mid = (low+high)/2;
		if(arr[mid] <= k && arr[mid+1] > k)
			return mid;
		
		if(arr[mid] < k)
			return searchingleftRight(arr, mid+1, high, k);
		return searchingleftRight(arr, low, mid-1, k);
	}
	
	private static void closestprint(int[] arr, int searchedElement, int numOfNearest, int length) {
		int left = searchingleftRight(arr, 0, length-1, searchedElement);
		int right = left +1;
		int count = 0;
		
		if(arr[left]==searchedElement)
			left--;
		
		while(left >= 0 && right < length && count < numOfNearest) {
			if(searchedElement - arr[left] < arr[right] - searchedElement)
				System.out.println(arr[left--]+" ");
			else
				System.out.println(arr[right++]+" ");
			count++;
		}
		
		while(count < numOfNearest && left >= 0) {
			System.out.println(arr[left--]+" ");
			count++;
		}
		
		while(count < numOfNearest && right < length) {
			System.out.println(arr[right++]+" ");
			count++;
		}
			
	}
	
}
