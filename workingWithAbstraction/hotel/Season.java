package workingWithAbstraction.hotel;

public enum Season {
    //4 сезона -> 4 константни обекта
    SUMMER(4),
    AUTUMN(1),
    WINTER(3),
    SPRING(2);

    private int multiplyCoefficient;

    Season(int multiplyCoefficient) {
        this.multiplyCoefficient = multiplyCoefficient;
    }


    public int getMultiplyCoefficient() {
        return multiplyCoefficient;
    }

    public void setMultiplyCoefficient(int multiplyCoefficient) {
        this.multiplyCoefficient = multiplyCoefficient;
    }
}
