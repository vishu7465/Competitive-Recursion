
public class Stair {

public static void main(String[] args) {
		
	stairrec(0, 5, "");
}

   public static void stairrec(int current,int n,String ans) {
	   
	   if(current==n){
		   
		   System.out.println(ans);
		   return;
	   }
	   
	   
	   if(current+1 <=n) {
		   stairrec(current+1, n, ans + "1");
	   }
	   if(current+2<=n) {
		   stairrec(current+2, n, ans +"2");
	   }
	   if(current+3<=n) {
		   stairrec(current+3, n, ans +"3");
	   }
	   
	   
   }



}
