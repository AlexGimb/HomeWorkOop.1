package AllFlower;

import Transport.ValidationUtils;

import java.util.Objects;


public class Flower {
    private String flowerName;
    private String country;
    private double cost;
    private int lifeSpan;

    public Flower(String flowerName, String country, double cost, int lifeSpan) {
        setFlowerName(flowerName);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);
    }

    public Flower(String flowerName, String country, double cost) {
        this(flowerName, country, cost, 3);
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = ValidationUtils.Validation(flowerName, "Роза");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = ValidationUtils.Validation(country, "Россия");
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = Math.max(cost, 1);
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = Math.abs(lifeSpan);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Double.compare(flower.cost, cost) == 0 && lifeSpan == flower.lifeSpan && Objects.equals(flowerName, flower.flowerName) && Objects.equals(country, flower.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowerName, country, cost, lifeSpan);
    }

    @Override
    public String toString() {
        return String.format("Название: %s, страна происхождения: %s, стоимость: %.2f, срок стояния цветка: %d",
                flowerName, country, cost, lifeSpan);
    }
}
