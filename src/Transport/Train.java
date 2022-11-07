package Transport;

import java.util.Objects;

public class Train extends Transport{
    private double price;
    private int travelTime;
    private String departureStation;
    private String endingStation;
    private int amountWagons;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed,
                 double price, int travelTime, String departureStation, String endingStation, int amountWagons,String fuel) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed,fuel);
        setPrice(price);
        setTravelTime(travelTime);
        setDepartureStation(departureStation);
        setEndingStation(endingStation);
        setAmountWagons(amountWagons);
    }

    @Override
    public void refill() {
        System.out.println("Нужно заправлять дизелем");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = Math.abs(price);
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = Math.abs(travelTime);
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = ValidationUtils.Validation(departureStation, "Станция отправления");
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = ValidationUtils.Validation(endingStation, "Конечная станция");
    }

    public int getAmountWagons() {
        return amountWagons;
    }

    public void setAmountWagons(int amountWagons) {
        if (amountWagons <= 0) {
            this.amountWagons = 5;
        } else {
            this.amountWagons = amountWagons;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Train train = (Train) o;
        return Double.compare(train.price, price) == 0 && travelTime == train.travelTime && amountWagons == train.amountWagons && Objects.equals(departureStation, train.departureStation) && Objects.equals(endingStation, train.endingStation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), price, travelTime, departureStation, endingStation, amountWagons);
    }

    @Override
    public String toString() {
        return "Марка: " + getBrand() + ", модель: " + getModel() +
                ", цвет: " + getColor() + ", год производства: " +
                getProductionYear() +
                ", страна сборки: " + getProductionCountry() +
                ", максимальная скорость: " + getMaxSpeed() +
                ", цена поездки: " + getPrice() +
                ", время поездки: " + getTravelTime() +
                ", станция отправления: " + getDepartureStation() +
                ", конечная станция: " + getEndingStation() +
                ", количество вагонов: " + getAmountWagons();
    }
}
