import java.util.Scanner;

public class CopyString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1;
		System.out.print("Enter String 1: ");
		s1 = sc.next();
		String s2="";
		
		for(int i=0;i<s1.length();i++) {
			s2=s2+s1.charAt(i);
		}
		
		System.out.println("String s2 "+s2);
		
	}

}
