
public class CoreJava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1; 
		String websit ="Vighneshwar";
		char vig ='V';
		double d = 5.099;
		boolean mycard=  true;
	
		System.out.println(vig);
		System.out.println(mycard);
		System.out.println(num + "I have given this number in declaration");
		int [] arr = {1,5,6,3,5,6,3};
		for (int i=0; i < arr.length; i++)
		{
			System.out.println("Array of "+ i+ "=" + arr[i]);
		}
		
		String [] Name = {"Vighnesh","Keerthi","Sahasradh","Moukthika"};
		for(int i=0; i< Name.length  ;i++)
		{
			System.out.println("Array of "+ i+ "=" + Name[i]);
				
		}
		
		for(String S:Name)
		{
			System.out.println(S);
		}
	}

}
