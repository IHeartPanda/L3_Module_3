package abstract_classes.cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		return getPopulation()*getGrowthRate()*(getGrowthRate()*.5);
	}

}
