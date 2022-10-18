public class Main {
    public static void main(String[] args) {
        Human maksim = new Human("Максим", 35, "бренд-менеджер");
        Human anna = new Human("Аня", 29, "Москва", "методист образовательных программ");
        Human katya = new Human("Катя", 28, "Калининград", "продакт-менеджером");
        Human artem = new Human("Артем", 27, "Москв", "директором по развитию бизнеса");

        System.out.println(maksim.toString());

        Car lada = new Car("Lada", "Grande", 1.7, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8", 3.0, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car kia = new Car("KIA", "Sportage 4 поколение", 2.4, "красный", 2018, "Южная Корея");
        Car hundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        System.out.println(bmw.toString());

    }
}