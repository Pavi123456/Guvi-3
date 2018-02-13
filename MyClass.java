import java.util.Scanner;

public class MyClass {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String str=sc.next();

        if(str.equals("Sunday") || str.equals("Sunday")){

            System.out.println("YES");

        }

        else if(str.equals("Monday") || str.equals("Tuesday") || str.equals("Wednesday") || str.equals("Thursday") || str.equals("Friday")){

            System.out.println("NO");

        }

        else{

            System.out.println("It's not day....");

        }

    }

}
