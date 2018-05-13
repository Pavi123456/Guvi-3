package HunterSet2;
import java.util.Scanner;
import java.util.Stack;

public class PalindromUsingStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine().toLowerCase();
		Stack<Character> st = new Stack<>();
		for(int i=0;i<str.length();i++) {
			st.push(str.charAt(i));
		}
		String strRev = "";
		while(!st.isEmpty()) {
			strRev = strRev+st.pop();
		}
		if(str.equals(strRev))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
