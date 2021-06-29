
public class permutation {

	public static void main(String[] args) {
		
		//permu("abc","");
	}
	
	public static void permu(String ques,String ans) {
		
		
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		
		
		for(int i=0;i<ques.length();i++) {
			
			String nq=ques.substring(0, i) + ques.substring(i+1);
			
			permu(nq, ans +ques.charAt(i));
			
			
			
		}
		
		
		
		
		
	}
}
