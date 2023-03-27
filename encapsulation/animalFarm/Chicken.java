package encapsulation.animalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.trim().length() < 1) {
            throw new IllegalStateException("Name cannot be empty.");
        }
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalStateException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        if (age <= 5) {
            return 2.0;
        } else if (age <= 11) {
            return 1.0;
        }
        return 0.75;
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day."
                , name, age, productPerDay());
    }
}

