import java.util.Scanner;

public class ReverseWord {
public static void main(String[] args) {
	System.out.println("Sring is ::");
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String res  ="";
	String[] words = str.split(" ");
	for (int i = 1; i < words.length; i++) {
		String sbStr= words[i];
		String revWord= "";
	for (int j = sbStr.length()-1; j >=0; j--) {
		revWord = revWord + sbStr.charAt(j);
	}
		res = res + revWord+" ";
	}
	System.out.println(words[0]+" "+res);
	sc.close();
}
}
