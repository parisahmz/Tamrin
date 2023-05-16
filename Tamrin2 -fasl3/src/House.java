
public class House {
	
	private int initial;
	private int energy;
	private double tax;
	
	public void SetData(int i,int e) {
	
		 initial = i;
		 energy = e;
		 tax = 0.025*i;
	}
	
	public double calculate() {
		
		double temp = initial + (5*energy) + (5*tax);
		return temp;
	}
}
