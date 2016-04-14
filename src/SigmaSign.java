
public class SigmaSign {
	int start;
	int end;
	int var;
	
	public SigmaSign(int start, int end, int var) {
		this.start = start;
		this.end = end;
		this.var = var;
	}
	
	public double berechne() {
		double n = 0;
		for(; start <= end; start++ ) {
			n += var;
		}
		return n;
	}
}
