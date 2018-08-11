
public class StringComp {
public static void main(String[] args) {
	String str1 ="Awaz de rha hai";
	String str2="Awaz de rha hai";
	String str3="duniya meri kaha hai";
	int res1 = str1.compareTo(str2);
	if(res1<0)
	{
		System.out.println(str1+" is less than "+str2);
	}
	else if(res1==0)
	{
		System.out.println(str1+" is equal to "+str2);
	}
	else
	{
		System.out.println(str1+" is greater than "+str2);
	}
	
	int res2 = str1.compareTo(str3);
	if(res2<0)
	{
		System.out.println(str1+" is less than "+str3);
	}
	else if(res2==0)
	{
		System.out.println(str1+" is equal to "+str3);
	}
	else
	{
		System.out.println(str1+" is greater than "+str3);
	}
	CharSequence cs = "Awaz de rha hai";
	System.out.println(str1.contentEquals(cs));
}
}
