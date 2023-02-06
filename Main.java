import java.util.ArrayList; 
class Main {
  public static void main(String[] args) {
    // create a new Zookeeper
Zookeeper myZoo = new Zookeeper();

// add a fish, a bird, and a reptile to the zoo
myZoo.addFish("Salmon", 10.5, "Saltwater");
myZoo.addBird("Eagle", 15.0);
myZoo.addReptile("Crocodile", 52.0);
myZoo.addFish("Goldfish", 2.5, "Fishbowl Water");
myZoo.addBird("Crow", 24.0);
myZoo.addReptile("Snake", 29.0);

// get the inventories of each type of animal
ArrayList<Fish> fishInventory = myZoo.getFishInventory();
ArrayList<Bird> birdInventory = myZoo.getBirdInventory();
ArrayList<Reptile> reptileInventory = myZoo.getReptileInventory();

// print the inventories
System.out.println("Fish inventory ID TAGS: ");

    for(int i =0; i<fishInventory.size(); i++){
      System.out.print((fishInventory.get(i)).getIdTag()+", ");
    }
    
System.out.println("\nBird inventory ID TAGS: ");
     for(int i =0; i<birdInventory.size(); i++){
      System.out.print((birdInventory.get(i)).getIdTag()+", ");
    }
System.out.println("\nReptile inventory ID TAGS: ");
     for(int i =0; i<reptileInventory.size(); i++){
      System.out.print((reptileInventory.get(i)).getIdTag()+", ");
    }
    

// find the most valuable animal
Animals mostValuable = myZoo.findMostValuable();
System.out.println("\nMost valuable animal: " + mostValuable.getAnimalsType());
  }
}