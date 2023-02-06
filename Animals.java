abstract class Animals {
    private double value;
    private String animalType;

    public Animals(double value, String animalType) {
        this.value = value;
        this.animalType = animalType;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    public String getAnimalsType() {
        return animalType;
    }
}
