
public class Shopper {

    private String name;
    private int age;
    private boolean discounted;
    private boolean isMinor;

    // Constructor - sets object once
    public Shopper(String name, int age) {
        this.name = name;
        this.age = age;
        this.discounted = (age >= 60);
        this.isMinor = (age < 18);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean getDiscounted() {
        return this.discounted;
    }

    public boolean getIsMinor() {
        return this.isMinor;
    }
}
