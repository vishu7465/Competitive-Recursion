
public class mazepath {

	public static void main(String[] args) {
		
		path(0, 0, 2, 2, "");
	}
	
	public static void path(int curentrow,int curentcol,int endrow,int endcol,String ans) {
		
		
		if(curentrow ==endrow && curentcol ==endcol) {
			System.out.println(ans);
			return;
		}
		if(curentrow > endrow || curentcol > endcol) {
			return;
		}
		
		
		path(curentrow , curentcol+1, endrow, endcol, ans +"H");	
		
		path(curentrow +1, curentcol, endrow, endcol, ans +"v");	
			
		
	}
	
}
