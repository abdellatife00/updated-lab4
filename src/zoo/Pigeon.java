package zoo;

public class Pigeon extends Bird implements AnimalBehavior {
    private String species;

    public Pigeon() {
        super();
        this.species = "Unknown";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String species) {
        super(name, "Grey");
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the pigeon is eating breadcrumbs.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " says: Coo coo!");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " the pigeon sleeps on a perch.");
    }

    @Override
    public void move() {
        System.out.println("Pigeon flies.");
    }

    public void carryMessage() {
        System.out.println(getName() + " is carrying a message.");
    }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    @Override
    public String toString() {
        return "Pigeon{" + super.toString() + ", species=" + species + "}";
    }
}
