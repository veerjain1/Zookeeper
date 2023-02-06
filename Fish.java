import java.util.ArrayList; 
import java.util.Random;
class Fish extends Animals {
  
    
    private int id;
    private String waterType;

    public Fish(String animalType, double value, String waterType) {
        super(value, animalType);
        Random rand = new Random();
        this.id = rand.nextInt(1000);
        this.waterType = waterType;
    }

    public int getIdTag() {
        return id;
    }

    public String getWaterType() {
        return waterType;
    }
}