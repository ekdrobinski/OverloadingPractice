
public class Animal {
    private String name;
    private boolean isDog;
    private double pounds;

    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public Animal(String name, boolean isDog, double pounds) {
        this.name = name;
        this.isDog = isDog;
        this.pounds = pounds;
    }

    public String getName() {
        return name;
    }
    public boolean isDog() {
        return isDog;
    }

    public String toString() {
        return name + " is a Dog = " + isDog;
    }
}
