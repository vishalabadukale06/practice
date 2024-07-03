
public class Ch65 {

	public static void main(String[] args) {
		
		String S1 = "www.gaagle.com";

		String s2=S1.replace('a','o');

		int a=s2.indexOf('g');
		String b= s2.substring(a);

		//System.out.println(b);//google.com
		 
		 
		 
		 int x=b.indexOf('e');
		String c= b.substring(x+1);
		//System.out.println(c);//.com
		 
		 String f=b.substring(0,b.length()-c.length());
		 System.out.println(f);//google

	}

}
