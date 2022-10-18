import java.util.Calendar;
import java.util.Objects;
public class Human {
    private int yearOfBirth;
    private String name;
    private String currentCity;
    private String jobTitle;
    int year = Calendar.getInstance().get(Calendar.YEAR);
    public Human(String name, int yearOfBirth, String currentCity, String jobTitle) {
        this.yearOfBirth = Math.abs(yearOfBirth);
        this.name = name;
        this.currentCity = currentCity;
        this.jobTitle = jobTitle;
    }
    public Human(int yearOfBirth) {
        this("Информация не указана", yearOfBirth, "Информация не указана", "Информация не указана");
    }
    public Human(String name,int yearOfBirth) {
        this(name, yearOfBirth, "Информация не указана", "Информация не указана");
    }
    public Human(String name, int yearOfBirth, String jobTitle) {
        this(name, yearOfBirth, "Информация не указана", jobTitle);
    }

    public int getAge() {
        return yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setAge(int age) {
        this.yearOfBirth = age;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return yearOfBirth == human.yearOfBirth && Objects.equals(name, human.name) && Objects.equals(currentCity, human.currentCity) && Objects.equals(jobTitle, human.jobTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfBirth, name, currentCity, jobTitle);
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + currentCity + ". Я родился в " + (year - yearOfBirth) + " году. Я работаю на должности "
                + jobTitle + ". Будем знакомы!";
    }
}
