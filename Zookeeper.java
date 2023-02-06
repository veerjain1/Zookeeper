import java.util.ArrayList; 
class Zookeeper {
    private ArrayList<Animals> zoo;

    public Zookeeper() {
        zoo = new ArrayList<>();
    }

    public void addFish(String animalType, double value, String waterType) {
        Fish fish = new Fish(animalType, value, waterType);
        zoo.add(fish);
    }

    public void addBird(String animalType, double value) {
        Bird bird = new Bird(animalType, value);
        zoo.add(bird);
    }

    public void addReptile(String animalType, double value) {
        Reptile reptile = new Reptile(animalType, value);
        zoo.add(reptile);
    }

      public ArrayList<Fish> getFishInventory() {
        ArrayList<Fish> fishList = new ArrayList<>();
        for (Animals a : zoo) {
            if (a instanceof Fish) {
                fishList.add((Fish) a);
            }
        }
        return fishList;
    }

    public ArrayList<Bird> getBirdInventory() {
        ArrayList<Bird> birdList = new ArrayList<>();
        for (Animals a : zoo) {
            if (a instanceof Bird) {
                birdList.add((Bird) a);
            }
        }
        return birdList;
    }

    public ArrayList<Reptile> getReptileInventory() {
        ArrayList<Reptile> reptileList = new ArrayList<>();
        for (Animals a : zoo) {
            if (a instanceof Reptile) {
                reptileList.add((Reptile) a);
            }
        }
        return reptileList;
    }

    public Animals findMostValuable() {
        double maxValue = Double.MIN_VALUE;
        Animals mostValuable = null;
        for (Animals a : zoo) {
            if (a.getValue() > maxValue) {
                maxValue = a.getValue();
                mostValuable = a;
            }
        }
        return mostValuable;
    }
}