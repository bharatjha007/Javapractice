import java.util.Scanner;

public class Newcharoccurance {
	    
	 
	    static void getOccuringChar(String str)
	    {
	        
	        
	 
	        int len = str.length();
	        int []count = new int[200];
	 
	        // Initialize count array index
	        for (int i = 0; i < len; i++)
	        	count[str.charAt(i)]++;
	 
	        // Create an array of given String size
	        char ch[] = new char[str.length()];
	        for (int i = 0; i < len; i++) {
	            ch[i] = str.charAt(i);
	            int find = 0;
	            for (int j = 0; j <= i; j++) {
	 
	                // If any matches found
	                if (str.charAt(i) == ch[j]) 
	                    find++;                
	            }
	 
	            if (find == 1) 
	                System.out.println("Number of Occurrence of " +
	                 str.charAt(i) + " is:" + count[str.charAt(i)]);            
	        }
	    }
	    public static void main(String[] args)
	    {
	    	System.out.println("string is::");
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        getOccuringChar(str);
	        sc.close();
	    }

}
