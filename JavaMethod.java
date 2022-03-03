
public class JavaMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaMethod g = new JavaMethod();
		//g.getdata();
		String name = g.getdata();
		System.out.println(name);
		JavaMethod2 g2 = new JavaMethod2();
		//g2.getdata2();
		String name2 = g2.getdata2();
		System.out.println(name2);
		
		String Name3= getdata3();
		System.out.println(Name3);
		
		String Name4 = g2.getdata4();
		System.out.println(Name4);
		
	}

	public String getdata() 
	{
	
		
			System.out.println("Hello World First method");
			return "Vighneshwar Reddy Pulmamidi";
		
		
	}
	public static String getdata3() 
	{
	
		
			System.out.println("Hello World from STatic method");
			return "Vighneshwar Reddy Pulmamidi from STatic method";
		
		
	}
}
