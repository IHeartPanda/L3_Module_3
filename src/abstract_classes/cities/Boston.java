package abstract_classes.cities;

public class Boston extends City{

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		return getPopulation()*getGrowthRate()+(getPopulation()*.5);
	}

}
