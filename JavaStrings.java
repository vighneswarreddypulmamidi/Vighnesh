
public class JavaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String literal - it creates the single object for the same string
		String S = "Vighneshwar";
		
		
		//String with object create two objects as we are giving the new 
		String S3 = new String("Vighneshwar");
		String S4 = new String("Vighneswar");
		String S2 = "Vighneswar Reddy Pulmamidi";
		String[] SplitString = S2.split("Reddy");
		System.out.println(SplitString[0]);
		System.out.println(SplitString[1]);
		//System.out.println(SplitString[2]);
		System.out.println(SplitString[0].trim());
		System.out.println(SplitString[1].trim());
		/*for (int i=0; i< S2.length() ; i++)
		{
			System.out.println(S2.charAt(i));
			
		} */
		for (int i= S2.length() - 1 ; i >= 0;  i--)
		{
			System.out.println(S2.charAt(i));
			
		}
		

	}

}
