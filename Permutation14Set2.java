package HunterSet2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Permutation14Set2 {
	static Set<String> hs = new HashSet<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		int len=str.length();
		Permutation14Set2 ps = new Permutation14Set2();
		ps.permu(str,0,len-1);
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

	private void permu(String str, int start, int end) {
		if(start==end) {
			hs.add(str);
		}
		else {
			for(int i=start;i<=end;i++) {
				str=swap(str,start,i);
				permu(str,start+1,end);
				str=swap(str,start,i);
			}
		}
	}
	

	private String swap(String str, int p, int q) {
		char tmp;
		char[] arr = str.toCharArray();
		tmp = arr[p];
		arr[p] = arr[q];
		arr[q] = tmp;
		return String.valueOf(arr);
	}

}
