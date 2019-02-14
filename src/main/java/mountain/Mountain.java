package mountain;

public class Mountain {
    public static final int MAX_HEIGHT = 8848;
    private String name;
    private double height;

    public String getName() {
        return name;
    }

    public Mountain setName(String name) {
        this.name = name;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public Mountain setHeight(double height) {
        this.height = height;
        return this;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(name).append(" ").append(height).toString();
    }
}
