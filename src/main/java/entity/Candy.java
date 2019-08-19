package entity;

public class Candy {
    private String name;
    private double energyValue;
    private double sugarContent;
    private double weight;

    public Candy() {
        this.name = "Toffee";
        this.energyValue = 391.0;
        this.sugarContent = 80.0;
        this.weight = 15;

    }

    public Candy(String name, double energyValue, double sugarContent, double weight) {
        this.name = name;
        this.energyValue = energyValue;
        this.sugarContent = sugarContent;
        this.weight = weight;
    }

    public double getEnergyValue() {
        return energyValue;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnergyValue(double energyValue) {
        this.energyValue = energyValue;
    }

    public void setSugarContent(double sugarContent) {
        this.sugarContent = sugarContent;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
