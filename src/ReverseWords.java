//Given a String S, reverse the string without reversing its individual words. Words are separated by dots.
//
//Example 1:
//
//Input:
//S = i.like.this.program.very.much
//Output: much.very.program.this.like.i
//Explanation: After reversing the whole
//string(not individual words), the input
//string becomes
//much.very.program.this.like.i

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello.my.is.vaishali";
		String rev ="";
		
		String str = "hello.my.is.vaishali";
        String[] arrOfStr = str.split("\\.");
  
        for(int i=arrOfStr.length-1;i>=0;i--) {
        	rev = rev +arrOfStr[i]+".";
        }
        StringBuffer sb = new StringBuffer(rev);
        sb.deleteCharAt(sb.length()-1);
        String str1 = new String(sb);
        System.out.println(str1);
	}

}
