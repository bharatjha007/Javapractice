import java.util.Scanner;

public class ReverseNormal {
public static void main(String[] args) {
	System.out.println("String is ::");
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String res = "";
	for (int i = str.length()-1; i >=0; i--) {
		res= res + str.charAt(i);
	}
	System.out.println(res);
	sc.close();
}
}
