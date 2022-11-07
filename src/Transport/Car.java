package Transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car extends Transport{
    public static class Key {
        private final boolean remoteStart;
        private final boolean keylessAccess;

        public Key(boolean remoteStart, boolean keylessAccess) {
            this.remoteStart = remoteStart;
            this.keylessAccess = keylessAccess;
        }
        public boolean isRemoteStart() {
            return remoteStart;
        }
        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return ", удалённый запуск: " + remoteStart +
                    ", бесключевой доступ: " + keylessAccess;
        }
    }

    public static class Insurance {
        private final double cost;
        private final int number;

        private int year;
        private int month;
        private int day;
        LocalDate id;

        public Insurance(int year, int month, int day, double cost, int number) {
            this.cost = cost;
            this.number = number;
            this.year = year;
            this.month = month;
            this.day = day;
            this.id = LocalDate.of(year, month, day);
        }

        public LocalDate getId() {
            return id;
        }

        public void validId() {
            if (LocalDate.now().isBefore(id)) {
                System.out.println("срок действия страховки: " + id);
            } else {
                System.out.println("Страховка просрочена");
            }
        }

        public double getCost() {
            return cost;
        }

        public int getNumber() {
            return number;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        @Override
        public String toString() {
            if (LocalDate.now().isBefore(id)) {
                return ", срок действия страховки: " + id +
                        ", стоимость: " + cost +
                        ", номер: " + number;
            } else {
                return ", страховка просрочена" +
                        ", стоимость: " + cost +
                        ", номер: " + number;
            }
        }
    }
    private double engineVolume;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String wheels;
    private Key key;
    private Insurance insurance;
    public Car(String brand, String model, double engineVolume,
               String color, int productionYear,
               String productionCountry, String transmission, String bodyType,
               String registrationNumber, int numberOfSeats,
               Key key,Insurance insurance,int maxSpeed,String fuel) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed,fuel);
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        this.bodyType = ValidationUtils.Validation(bodyType, "Информация отсутствует");
        setRegistrationNumber(registrationNumber);
        this.numberOfSeats = numberOfSeats > 0 ? numberOfSeats : 5;
        setWheels(wheels);
        this.key = key;
        this.insurance = insurance;
    }

    @Override
    public void refill() {
        if (getFuel().equalsIgnoreCase("Бензин")) {
            System.out.println("Нужно заправлять бензин");
        } else if (getFuel().equalsIgnoreCase("Дизель")) {
            System.out.println("Нужно заправлять дизель");
        } else {
            System.out.println("Нужно заряжать на специальных электро-парковках");
        }
    }

    public static boolean registrationNumberValid(String registrationNumber) {
        return registrationNumber.matches
                ("[E,T,Y,O,P,A,H,K,X,C,B,M,У,К,Е,Н,Х,В,А,П,Р,О,С,М,Т]\\d{3}[E,T,Y,O,P,A,H,K,X,C,B,M,У,К,Е,Н,Х,В,А,П,Р,О,С,М,Т]{2}\\d{2,3}");
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }else
        this.engineVolume = engineVolume;
    }
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        this.transmission = ValidationUtils.Validation(transmission, "Информация отсутствует");
    }
    public String getBodyType() {
        return bodyType;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumberValid(registrationNumber) == true) {
            this.registrationNumber = registrationNumber;
        } else
            this.registrationNumber = "Номер не верный";
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public String getWheels() {
        return wheels;
    }
    public void setWheels(String wheels) {
        int curentMonth = LocalDate.now().getMonthValue();
        if (curentMonth < 11 && curentMonth > 4) {
            this.wheels = "Летняя";
        }else
            this.wheels = "Зимняя";
    }
    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && numberOfSeats == car.numberOfSeats && Objects.equals(transmission, car.transmission) && Objects.equals(bodyType, car.bodyType) && Objects.equals(registrationNumber, car.registrationNumber) && Objects.equals(wheels, car.wheels) && Objects.equals(key, car.key) && Objects.equals(insurance, car.insurance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineVolume, transmission, bodyType, registrationNumber, numberOfSeats, wheels, key, insurance);
    }

    @Override
    public String toString() {
        return "Марка: " + getBrand() + ", модель: " + getModel() +
                ", объем двигателя: " + getEngineVolume() +
                ", цвет: " + getColor() + ", год производства: " +
                getProductionYear() +
                ", страна сборки: " + getProductionCountry() +
                ", коробка передач : " + getTransmission() +
                ", тип кузова: " + getBodyType() +
                ", максимальная скорость: " + getMaxSpeed() +
                ", регистрационный номер: " + getRegistrationNumber() +
                ", мест: " + getNumberOfSeats() +
                ", резина: " + getWheels() + key.toString() +
                insurance.toString();
    }
}
