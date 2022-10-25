package entities;

public class Individual extends TaxPayer {
	
	private Double expends;

	
	public Individual(String name, Double anualIncome, Double expends) {
		super(name, anualIncome);
		this.expends = expends;
	}


	public Double getExpends() {
		return expends;
	}


	public void setExpends(Double expends) {
		this.expends = expends;
	}


	@Override
	public double tax() {
		
		if (getAnualIncome() < 20000) {
			
			return getAnualIncome()*0.15 - (expends*0.5);
			
		} else {
			
			return getAnualIncome()*0.25 - (expends*0.5);
			
		}
		
	}


	@Override
	public String toString() {
		
		return getName()
				+ ": $"
				+ String.format("%.2f", tax());
		
	}
	
	
	
}
