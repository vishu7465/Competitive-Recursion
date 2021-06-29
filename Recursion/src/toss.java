
public class toss {
public static void main(String[] args) {
		
		stairrec(3,  "");
		
	}
	
	
	public static void stairrec(int n,String ans) {
		
		if(n==0) {
			System.out.println(ans);
			return;
		}
		
		stairrec(n-1," h " + ans);
		stairrec(n-1," t " + ans);
		
		
		
		
	}
}
