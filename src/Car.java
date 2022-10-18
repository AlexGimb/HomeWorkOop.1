import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    public Car(String brand) {
        this(brand, "default", 1.5, "белый", 2000, "default");
    }

    public Car(String brand, String model) {
        this(brand, model, 1.5, "белый", 2000, "default");
    }

    public Car(String brand, String model, double engineVolume) {
        this(brand, model, engineVolume, "белый", 2000, "default");
    }

    public Car(String brand, String model, double engineVolume, String color) {
        this(brand, model, engineVolume, color, 2000, "default");
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear) {
        this(brand, model, engineVolume, color, productionYear, "default");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && productionYear == car.productionYear && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(productionCountry, car.productionCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, productionYear, productionCountry);
    }

    @Override
    public String toString() {
        return "Марка: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume +
                ", цвет: " + color + ", год производства: " + productionYear +
                ", страна сборки: " + productionCountry;
    }
}
