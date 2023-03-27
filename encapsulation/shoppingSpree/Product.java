package encapsulation.shoppingSpree;

public class Product {
    private String name;
    private  double cost;

    public Product(String name, double cost) {
        setName(name);
        setCost(cost);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(name.trim().isEmpty()){
            throw  new IllegalStateException("Name cannot be empty");
        }
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    private void setCost(double cost) {
        if(cost < 0){
            throw new IllegalStateException("Money cannot be negative");
        }
        this.cost = cost;
    }
}
