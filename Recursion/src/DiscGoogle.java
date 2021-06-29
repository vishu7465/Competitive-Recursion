
public class DiscGoogle {

	public static void main(String[] args) {
		Dis(3, "S" , "d" , "h" );
	}
	
	public static void Dis(int n,String src,String  dst,String helper) {
		
		if(n==0) {
			return;
		}
		
		Dis(n-1,src,helper,dst);
		
		System.out.println(" move " +n  +"disk from " +src + " to " +dst) ;
		
		Dis(n-1,helper,dst,src);
		
		
	}
	
}
