
public class JavaProgram {

	public static void main(String[] args) {

		String v = "Welcome to java";

		String q = "";
		
		String n ="";
		
		String [] o = q.split(" ");
		
		for(int t = 0;t<o.length ;t++) {
			
			n += o[t];
		}

		for (int j = v.length() - 1; j >= 0; j--) {

			n += v.charAt(j);

		}
		
		System.out.println(n);

		String[] c = v.split(" ");

		String u = "";

		for (int i = 0; i < c.length; i++) {

			int y = c[i].length();
			
			int e = 0;

			for (int m = e; m < y; m++) {

				u += n.charAt(m);
			}
			
			u += " ";
			
			e += y+1;
			
		}
		
		System.out.println(u);     
	}
}