import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		String s1;
		String rev="";
		boolean flag = false;
		System.out.print("Enter String : ");
		Scanner sc = new Scanner(System.in);
		s1=sc.nextLine();
		
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i) == rev.charAt(i)) {
				flag =true;
			}else {
				flag= false;
				System.out.println("Not a Palindrome");
				break;
			}
		}
		if(flag) {
			System.out.println("Palindrome");
		}
		
		
	}
}
