package entities;

public abstract class TaxPayer {
	
	private String name;
	private Double anualIncome;
	
	
	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getAnualIncome() {
		return anualIncome;
	}


	public void setRendaAnual(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract double tax();
	
	public abstract String toString();
	
}
