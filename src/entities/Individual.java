package entities;

public class Individual extends TaxPayer{
	
	private Double healthExpenditures;
	
	public Individual() {
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double taxesPaid() {
		if (anualIncome >= 20000.00) {
			return anualIncome * 0.25;		
		}
		if (anualIncome >= 20000.00 && healthExpenditures > 0.0) {
			return (anualIncome * 0.25) - (healthExpenditures * 0.50);
		}
		if (anualIncome < 20000.00) {
			return anualIncome * 0.15;
		}
		if (anualIncome < 20000.00 && healthExpenditures > 0.0) {
			return (anualIncome * 0.15) - (healthExpenditures * 0.50);
		}
		return null;
	}

}
