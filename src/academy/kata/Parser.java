package academy.kata;

class Parser {
	String arg1, arg2, operator;
	int X, V, I;
	
	Parser(String a1, String a2, String op){
		arg1 = a1;
		arg2 = a2;
		operator = op;
		X = 88; V = 86; I = 73; //ansi of roman nums
	}
	
	public Calculate setData() {
		Calculate data = new Calculate();
		
		data.firstOperand = get(data, arg1);
		boolean compare = data.isRoman;
		data.secondOperand = get(data, arg2);
		isSame(compare, data.isRoman);
		data.operator = getOperator();
		
		
		return data;
	}
	private int get(Calculate data, String arg) {
		int length = arg.length();
		byte bytes[] = arg.getBytes();
		
		String temp = "";
		for(int i = 0; i < length; i++) {
			
			data.isRoman = isCorrect((int)bytes[i]);
			temp += String.valueOf((char)bytes[i]);
			
			try {
				if((i > 0) && data.isRoman != isCorrect((int)bytes[i-1]))
					throw new Exception("Несовместимые символы!");
			}
			catch (Exception ex) {
				System.out.println(ex.getMessage());
				System.exit(1);
			}
		}//for
		if(data.isRoman)
			return Converter.toArabic(temp);
		else
			return Integer.parseInt(temp);
	}//getFirst

	private char getOperator() {
		char temp = ' ';
		byte bytes[] = operator.getBytes();
		
		for(int i = 0; i < operator.length(); i++) {
			
			if( ((int)bytes[i] == (int)'+') || 
			    ((int)bytes[i] == (int)'-') ||
			    ((int)bytes[i] == (int)'*') ||
			    ((int)bytes[i] == (int)'/') )
				      temp = (char)bytes[i];
		}//for
		return temp;
	}
 	private boolean isCorrect(int instance) {
		boolean isRoman = false;
		try {
			if((instance > 47) && (instance < 58))
				isRoman = false;
			else if((instance == X) || (instance == I) || (instance == V))
				isRoman = true;
			else
				throw new Exception("Неправильное значение операнда");
		}//try
		catch(Exception ex){
			System.out.println(ex.getMessage());
			System.exit(1);
		}
		
		return isRoman;
	}
		
	private void isSame(boolean a, boolean b) {
		try {
			if(a != b)
				throw new Exception("используются одновременно разные системы счисления");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			System.exit(1);
		}
	} //isSame
} //Parser