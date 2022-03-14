/* It's my first Java code */
package academy.kata;
import java.util.*;
 

public class Program {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("Enter expression: ");
			
			String arg1 = scan.next();
			String operator = scan.next();
			String arg2 = scan.next();
			
			Parser line = new Parser(arg1, arg2, operator);
			Calculate item = new Calculate();
			item = line.setData(); 
			
			if(item.isRoman)
				System.out.println(Converter.toRoman(item.getValue()));
			else
				System.out.println(item.getValue());
			
			 
		}while(repeat()); 
		scan.close();		
		
	}
	private static boolean repeat() {

		System.out.print("Press enter for continue\n"
				+ "Write smth for stop");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s.isBlank())
			return s.isBlank();
		else {
			sc.close();
			return s.isBlank();
		}//else
	}//repeat
}//Calculate
