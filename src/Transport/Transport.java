package Transport;

import java.util.Objects;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;
    private String fuel;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed,String fuel) {
        this.brand = ValidationUtils.Validation(brand, "Информация отсутствует");
        this.model = ValidationUtils.Validation(model, "Информация отсутствует");
        this.productionYear = productionYear >= 0 ? productionYear : 2000;
        this.productionCountry = ValidationUtils.Validation(productionCountry, "Информация отсутствует");
        setColor(color);
        setMaxSpeed(maxSpeed);
        setFuel(fuel);
    }
    public String getFuel() {
        return fuel;
    }
    public void setFuel(String fuel) {
        this.fuel = ValidationUtils.Validation(fuel, "Информация отсутствует");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = ValidationUtils.Validation(color, "Белый");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 100;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
    public abstract void refill();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return productionYear == transport.productionYear && maxSpeed == transport.maxSpeed && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(productionCountry, transport.productionCountry) && Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Марка: " + getBrand() + ", модель: " + getModel() +
                ", цвет: " + getColor() + ", год производства: " +
                getProductionYear() +
                ", страна сборки: " + getProductionCountry() +
                ", максимальная скорость: " + getMaxSpeed() ;
    }
}
