package MyCalcPkg;
public class MainCalculator {
	public static void main(String[] args) {		
		Calculator calc = new Calculator();
		int sum = calc.addition(10, 20);
		System.out.println("Addition is "+sum);
	}
}
