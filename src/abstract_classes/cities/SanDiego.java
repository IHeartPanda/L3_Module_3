package abstract_classes.cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		return getPopulation()*getGrowthRate() + 1000000;
	}

}
