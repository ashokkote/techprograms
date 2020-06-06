
public class MoreHacknRack2 {

	static String kangaroo(int x1, int v1, int x2, int v2) {

		String result = "";
		int x =0, y=0;
		
		while(x<10000 || y<10000) {
			
			if(x1+v1 == x2+v2 && x==y) {
				result = "YES";
				break;
			}
			
			x1 += v1; ++x;
			x2 += v2; ++y;		
		}
				
		return result.equals("") ? "NO" : result;
    }
	
	
	public static void main(String[] args) {
		
		//System.out.println(kangaroo(0,3,4,2));
		System.out.println(kangaroo(0,2,5,3));

	}

}
