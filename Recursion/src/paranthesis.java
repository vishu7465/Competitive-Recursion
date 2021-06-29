import java.util.ArrayList;
import java.util.List;

public class paranthesis {

	public static void main(String[] args) {
	List<String>list =new ArrayList<String>();
	
		
	pervalid(3, 0, 0, "",list );
	
		System.out.println(list);
		
		
	}
	
	public static void pervalid(int n,int op,int clo,String ans,List<String> list) {
	
		
		
		
		
		
		if(op==n && clo==n) {
			list.add(ans);
			//System.out.println(ans);
			return;
		}
		if(op > n || clo > op) {
			return;
		}
		
		pervalid(n, op+1, clo, ans +"(", list);
		
		pervalid(n, op, clo+1, ans +")", list);
	}
	
}
