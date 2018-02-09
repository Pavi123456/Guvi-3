package day8Project;

import java.util.*;


public class ArrayListDemo {
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,count=0;
		char ch;
		//String str1;
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		for(i=0;i<str.length();i++){
			ch=str.charAt(i);
			//str1=Character.toString(ch);
			if(ch==' '){
				continue;
			}
			else{
				count++;
			}
		}
		System.out.println(count);
	}

}
