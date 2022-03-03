import java.util.ArrayList;

public class Javaifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,5,6,3,5,6,3,10,100,122};
		for(int i=0; i< arr.length;i++)
		{
		
			//System.out.println(arr[i]);
			if(arr[i] % 2 == 0)
			{
				System.out.println(arr[i]);
				break;
			}
			else {
				System.out.println(arr[i] + "  is not multiple of 2");
			}
		}
		ArrayList a = new ArrayList();
		a.add("Vighnesh");
		a.add("Sahasradh");
		a.add("Sahasradh");
		a.add("Moukthika");
		a.remove(2);
		System.out.println(a.get(1));
	}
	}

