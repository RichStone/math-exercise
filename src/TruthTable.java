import java.security.InvalidParameterException;

public class TruthTable {
	private int numberOfValues;
	private String conjunction;
	private String [] listOfValues;
	
	public TruthTable(int numberOfValues, String conjunction) {
		if(numberOfValues <= 1) {
			throw new InvalidParameterException("It doesn't make sense to create a table with 0 or less fields");
		}
		this.numberOfValues = numberOfValues;
		this.conjunction = conjunction;
		listOfValues = new String[numberOfValues];
		//TODO fill the arrays with chars A, B and so on (using Unicode?)
	}
}
