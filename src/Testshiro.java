
public class Testshiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// find the highest value
		int a = 3000;
		int b = 4000;
		int c = 5000;
		char d = ' ';
		
		
		if(a>b) 
		{
			d = 'A';
			if(a>c)
			{
				d = 'A';
			}
			
			
		 }
		
		
		
		if(b>a)
		{
			d = 'B';
			if(b>c) 
			{
				d = 'B';
			}
		 }
			
			
		if (c>a) 
		{
			d = 'C';
			if (c>b) 
			{
				d = 'C';
			}
						
		 }
			
		
		
		System.out.println(d+" is the highest");
			
				

	}

}
