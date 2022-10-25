package entities;

public class Company extends TaxPayer {
	
	private Integer employees;

	public Company(String name, Double anualIncome, Integer employees) {
		super(name, anualIncome);
		this.employees = employees;
	}

	public Integer getNumFunc() {
		return employees;
	}

	public void setNumFunc(Integer numFunc) {
		this.employees = numFunc;
	}

	@Override
	public double tax() {
		
		if (employees <= 10) {
			
			return getAnualIncome()*0.16;
			
		} else {
			
			return getAnualIncome()*0.14;
			
		}
		
	}

	@Override
	public String toString() {
		
		return getName() 
				+ ": $"
				+ String.format("%.2f", tax());
				
	}
	
	
	
}
