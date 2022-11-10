
public class JumpingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X=50;
		 while(X>0) {
	            int n1=(int) X%10;
	            int n2 =(int) X%100;
	            int rem = Math.abs(n2-n1);
	            if(rem != 1) {
	                X=X-1;
	                break;
	            }
	        }
	      System.out.println("X : "+X);

	}

}
