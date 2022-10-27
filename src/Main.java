import AllFlower.Bouquet;
import AllFlower.Flower;
import Transport.Car;

public class Main {
    public static void main(String[] args) {
//        Human maksim = new Human("Максим", 35, "", " ");
//        Human anna = new Human("Аня", 29, "Москва", "методист образовательных программ");
//        Human katya = new Human("Катя", 28, "Калининград", "продакт-менеджером");
//        Human artem = new Human("Артем", 27, "Москв", "директором по развитию бизнеса");
//
//        System.out.println(maksim.toString());

        Car lada = new Car("Lada", "Grande", 1.7, "желтый",
                2015, "Россия", "Автомат",
                "Пикап", "В123BM75", 4,
                new Car.Key(true, true),
                new Car.Insurance(2022,9,29, 7500.00, 123456789));
//        Car audi = new Car("Audi", "A8", 3.0, "черный", 2020, "Германия");
//        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
//        Car kia = new Car("KIA", "Sportage 4 поколение", 2.4, "красный", 2018, "Южная Корея");
//        Car hundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

//        System.out.println(bmw.toString());
        System.out.println(lada.toString());


        Human vladimir = new Human("Влдимир", 21, "Казань", "нигде не работает");

        Flower rose = new Flower("Роза обыкновенная", "Голандия", 35.59);
        Flower chrysanthemum = new Flower("Хризантема", " ", 15, 5);
        Flower pion = new Flower("Пион", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.5, 10);

        System.out.println(chrysanthemum.toString());

        Bouquet bouquet = new Bouquet(
                rose,rose,rose,
                chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,
                gypsophila);
        System.out.printf("Стоимость букета: %.2f, и простоит: %d дня",bouquet.getCost(),bouquet.getLifeSpan());
    }

}