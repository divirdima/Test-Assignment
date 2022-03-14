package academy.kata;

class Calculate {
	boolean isRoman;
	int firstOperand;
	int secondOperand;
	char operator;
	
	Calculate(){
		isRoman = false;
		
	}
	
	public int getValue() {
		isCorrect();
		switch(operator) {
		case '+': 
			return add();
		case '-': 
			return minus();
		case '/': 
			return devide();
		case '*': 
			return multiply();	
		default: 
			return 0;
		}
	}
	
	private int add() {
		return firstOperand + secondOperand;
	}
	private int minus() {
		return firstOperand - secondOperand;
	}
	private int multiply() {
		return firstOperand * secondOperand;
	}
	private int devide() {
		return firstOperand / secondOperand;
	}
	
	private void isCorrect() {
		try {
			if((firstOperand < 1) || (secondOperand < 1)) 
				throw new Exception("операнд меньше 1!");
			else if((firstOperand > 10) || (secondOperand > 10))
				throw new Exception("операнд больше 10!");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			System.exit(1);
		}
	}
}