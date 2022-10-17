package MyCalcPkg;
public class MainCalculator {
	public static void main(String[] args) {		
		Calculator calc = new Calculator();
		int sum = calc.addition(10, 20);
		System.out.println("Addition is "+sum);
		int sub = calc.substraction(20, 10);
		System.out.println("Substraction is "+sub);
	}
}
