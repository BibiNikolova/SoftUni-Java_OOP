package interfacesAndAbstractions.borderControl;

public class Citizen implements Identifiable{

    private String name;
    private int age;
    private String id;

    public Citizen(String name, int age, String id, String s) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return id;
    }
}
