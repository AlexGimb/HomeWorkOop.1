package Transport;

public class Bus extends Transport {

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed,String fuel) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed,fuel);
    }

    @Override
    public void refill() {
        if (getFuel().equalsIgnoreCase("Бензин")) {
            System.out.println("Нужно заправлять бензин");
        }  else {
            System.out.println("Нужно заправлять дизель");
        }
    }
}
