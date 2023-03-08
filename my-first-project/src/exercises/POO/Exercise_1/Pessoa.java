package exercises.POO.Exercise_1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String name;
    private String dateBirthStr;
    private double height;

    public Pessoa(String name, String dateBirthStr, double height) {
        this.name = name;
        this.dateBirthStr = dateBirthStr;
        this.height = height;
    }

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Date of birth: " + dateBirthStr);
        System.out.println("Height: " + height + " meters");
    }

    public void getAge() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataBirth = LocalDate.parse(dateBirthStr, formatter);

        LocalDate dataAtual = LocalDate.now();
        int idade = Period.between(dataBirth, dataAtual).getYears();

        System.out.println("Age: " + idade + " years old");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateBirth() {
        return dateBirthStr;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirthStr = dateBirth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
