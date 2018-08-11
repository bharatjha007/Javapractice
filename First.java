import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		int a;
		int i=0;
		System.out.println("Table of ::");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		for (i = 1; i <=10; i++) {
			System.out.println(a*i);
		}
		sc.close();
	}

}
