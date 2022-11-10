
public class LCUC {

	public static void main(String[] args) {
		
		String s1 = "vaishali";
		String s2 = "VAISHALI";
		String s3 = "";
		String s4 = "";
		
		for(int i=0;i<s1.length();i++) {
		   s3=s3+(char)(s1.charAt(i)-32);	// 'a' = 97 - 32 = 65 = 'A'
		}
		for(int i=0;i<s2.length();i++) {
			   s4=s4+(char)(s2.charAt(i)+32);	// 'A' = 65 + 32 = 97 = 'a'
	    }
		System.out.println("String converted from LC to UC "+s3);
		System.out.println("String converted from UC to LC "+s4);
	}

}
