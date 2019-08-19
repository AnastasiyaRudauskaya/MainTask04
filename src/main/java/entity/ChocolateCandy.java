package entity;

public class ChocolateCandy extends Candy {
    private double percentageOfCocoa;

    public ChocolateCandy(String name, double energyValue, double sugarContent,
                          double weight, double percentageOfCocoa) {
        super(name, energyValue, sugarContent, weight);
        this.percentageOfCocoa = percentageOfCocoa;
    }


    public double getPercentageOfCocoa() {
        return percentageOfCocoa;
    }

    public void setPercentageOfCocoa(double percentageOfCocoa) {
        this.percentageOfCocoa = percentageOfCocoa;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        ChocolateCandy other = (ChocolateCandy) obj;
        return (this.getSugarContent() == other.getSugarContent() &&
                this.getEnergyValue() == other.getEnergyValue() &&
                this.getName() == other.getName() &&
                this.getPercentageOfCocoa() == this.getPercentageOfCocoa());
    }

    @Override
    public int hashCode() {
        return (int) (150 * getSugarContent()) + (int) getEnergyValue() + 300 * (int) getWeight() +
                getName().hashCode() + (int) getPercentageOfCocoa() * 100;
    }

    @Override
    public String toString() {
        return ("Chocolate candy: " + this.getName() + ". Weight: " + this.getWeight() + ". Energy value: " + this.getEnergyValue() +
                " kkal. Sugar content: " + this.getSugarContent() + " g in 100 g. " +
                this.getPercentageOfCocoa() + "% of cocoa.");
    }
}
