package interfacesAndAbstractions.foodShortage;

public class Citizen implements Person, Identifiable, Birthable, Buyer {

    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food;

    Citizen(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

    @Override
    public int getFood() {
        return food;
    }

    @Override
    public String getBirthDate() {
        return null;
    }
}
