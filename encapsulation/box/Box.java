package encapsulation.box;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        ensureParameters(length, "Length");
        this.length = length;
    }

    private void setWidth(double width) {
        ensureParameters(width, "Width");
        this.width = width;
    }

    private void setHeight(double height) {
        ensureParameters(height, "Height");
        this.height = height;
    }

    private void ensureParameters(double parameter, String messagePrefix) {
        if (parameter <= 0) {
            throw new IllegalStateException(messagePrefix + " cannot be zero or negative.");
        }
    }

    public double calculateSurfaceArea() {
        return (2 * length * width) + (2 * length * height) + (2 * width * height);
    }

    public double calculateLateralSurfaceArea() {
        return (2 * length * height) + (2 * width * height);
    }

    public double calculateVolume() {
        return length * width * height;
    }

}
