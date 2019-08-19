package entity;

public class JellyCandy extends Candy {
    public JellyCandy(String name, double energyValue, double sugarContent, double weight) {
        super(name, energyValue, sugarContent, weight);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        JellyCandy other = (JellyCandy) obj;
        return (this.getSugarContent() == other.getSugarContent() &&
                this.getEnergyValue() == other.getEnergyValue() &&
                this.getName() == other.getName() &&
                this.getWeight() == other.getWeight());
    }

    @Override
    public int hashCode() {
        return (int) (150 * getSugarContent()) + (int) getEnergyValue() + 300 * (int) getWeight() +
                getName().hashCode();
    }

    @Override
    public String toString() {
        return ("Jelly candy: " + this.getName() + ". Weight: " + this.getWeight() + ". Energy value: " + this.getEnergyValue() +
                " kkal. Sugar content: " + this.getSugarContent() + " g in 100 g.");
    }
}
