package loops; 
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables 
		int x = 0;
		int y = 0; 
		
		//checks if sum < 200
		while(x + y < 200) 
		{
			//when y > x, 20 is added to x
			if(y > x) {
				x +=20;
			}
			
			//if not y > x, 50 is added to y 
			else
			{
				y += 50; 
			}
		}
		
		//values are printed 
		System.out.println("x = " + x + " y = "+ y);

	}

}
