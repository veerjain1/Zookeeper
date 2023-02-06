
import java.util.Random;
class Bird extends Animals {
    
    private int id;
    private String animalType;

    public Bird(String animalType, double value) {
        super(value,animalType);
        Random rand = new Random();
        this.id = rand.nextInt(1000);
        this.animalType = animalType;
    }

    public int getIdTag() {
        return id;
    }

    public String getAnimalsType() {
        return animalType;
    }
}