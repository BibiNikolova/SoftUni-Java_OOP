package interfacesAndAbstractions.foodShortage;

public class Rebel implements Buyer, Person {
    private String name;
    private int age;
    private String group;
    private int food;

    Rebel(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void buyFood() {
        this.food += 5;

    }

    @Override
    public int getFood() {
        return food;
    }
}
