import java.security.InvalidParameterException;

public class Logarithm {
	double a;
	double b;
	double x;
	
	public Logarithm (int a, int b) {
		if((a & b) <= 0) {
			throw new InvalidParameterException("The value of and b cannot be zero by mathematical definition");
		}
		this.a = a;
		this.b = b; 
	}
	
	private double calculate() {
		
	}
}
