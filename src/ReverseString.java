import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		String s1;
		String rev="";
		System.out.print("Enter String : ");
		Scanner sc = new Scanner(System.in);
		s1=sc.nextLine();
		
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		
		System.out.println("Reverse of input String is "+rev);
		

	}

}
