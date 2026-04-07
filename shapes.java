//Sophie Lim, 222332514
package Q2;
import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//variables
		String message; 
		
		String star1 = ("*");
		String star3 = ("***");
		String star5 = ("*****");
		
		String s1 = (" ");
		String s2 = ("  ");
		
		String hori = ("*********");
		String vert = (star1 + "\t" + star1);
		String wallL = (star1 + "\t");
		String wallR = ("\t" + star1);
		
		int val = 8;
		
		System.out.print("Enter greeting message: " + "\n"); //prompt for input
		message = scan.next();
		System.out.println("\n" + message + "\n");
		
		//diamond shape
		System.out.println(s2 + star1);
		System.out.println(s1 + star3);
		System.out.println(star5);
		System.out.println(s1 + star3);
		System.out.println(s2 + star1 + "\n");
		
		//number values 
		val--;
		int n1 = val;
		
		val--;
		int n2 = val;
		
		val += 4;
		int n3 = val;
		
		val += 5;
		int n4 = val;
		
		//rectangle
		System.out.println(hori);
		System.out.println(vert);
		System.out.println(wallL + n1 + wallR);
		System.out.println(wallL + n2 + wallR);
				
		System.out.print(vert + "\n");
		System.out.println(wallL + n3 + wallR);
		System.out.println(wallL + n4 + wallR);
		System.out.println(vert + "\n" + vert);
		System.out.println(vert + "\n" + vert);
		System.out.println(hori + "\n");
				
		//diamond 
		System.out.println(s2 + s2 + star1);
		System.out.println(s2 + s1 + star1 + s1 + star1);
		System.out.println(s1 + star1 + s2 + s2 + star1);
		System.out.println(star1 + s2 + s2 + s2 + star1);
		System.out.println(s1 + star1 + s2 + s2 + star1);			
		System.out.println(s2 + star1 + s2 + star1);
		System.out.println(s2 + s1 + star1 + "\n");
				
		System.out.println("\" + \"Enjoy!\"" + "\\\\\"");
	}

}
