import Transport.ValidationUtils;

import java.util.Calendar;
import java.util.Objects;

public class Human {
    private static final String DEFAULT_VALUE = "Информация отсутствует";
    private int yearOfBirth;
    private String name;
    private String currentCity;
    private String jobTitle;
    int year = Calendar.getInstance().get(Calendar.YEAR);
    public Human(String name, int yearOfBirth, String currentCity, String jobTitle) {
        this.name = ValidationUtils.Validation(name, DEFAULT_VALUE);
        setYearOfBirth(yearOfBirth);
        setCurrentCity(currentCity);
        setJobTitle(jobTitle);
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
        this.currentCity = ValidationUtils.Validation(currentCity, DEFAULT_VALUE);
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = ValidationUtils.Validation(jobTitle, DEFAULT_VALUE);
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = Math.max(yearOfBirth, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return yearOfBirth == human.yearOfBirth && year == human.year && Objects.equals(name, human.name) && Objects.equals(currentCity, human.currentCity) && Objects.equals(jobTitle, human.jobTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfBirth, name, currentCity, jobTitle, year);
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + currentCity + ". Я родился в " + (year - yearOfBirth) + " году. Я работаю на должности "
                + jobTitle + ". Будем знакомы!";
    }
}
