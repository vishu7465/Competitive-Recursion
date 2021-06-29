
public class Increase {

	public static void main(String[] args) {
		di(10);
	}
	
	public static void di(int n) {
		if(n==0) {
			return;
		}
		
		di(n-1);
		
		System.out.println(n);
		
		
		
	}
}
