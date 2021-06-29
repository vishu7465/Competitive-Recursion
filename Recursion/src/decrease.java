
public class decrease {

	public static void main(String[] args) {
		de(199);
	}
	
	public static void de(int n) {
		if(n==0) {
			return ;
		}
		System.out.println(n);
		
		de(n-1);
		
		
	}
	
}
