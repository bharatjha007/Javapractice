
public class String1 {

	public static void main(String[] args) {
		String str = "Baba Bade Dayalu Hai";
		char atIndex1 = str.charAt(1);
		char atIndex2 = str.charAt(5);
		System.out.println(atIndex1+" "+atIndex2);
		int a = str.codePointAt(2);
		System.out.println(a);
	}

}
