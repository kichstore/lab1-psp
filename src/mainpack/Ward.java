package mainpack;

import java.util.List;

public class Ward {
    private int seats;
    private String surname;
    private int freebunk;


    public Ward() {
        this.seats = 10;
        this.surname = "";
        this.freebunk = 0;
    }
    public Ward(int seats, String surname, int freebunk) {
        this.seats = seats;
        this.surname = surname;
        this.freebunk = freebunk;

    }
    public void print() {
        System.out.println("Всего мест: " + this.seats);
        System.out.println("Имя закрепленного врача: " + this.surname);
        System.out.println("Колличество свободных мест: " + this.freebunk);
    }
    public void print(int number) {
        System.out.println("Всего мест: " + this.seats);
        System.out.println("Имя закрепленного врача: " + this.surname);
        System.out.println("Колличество свободных мест: " + this.freebunk);
        System.out.println(number);
    }

    public static void HuwMuchFree(List<Ward> ward) {
        int sumSeats = 0;
        int sumFreebunk = 0;
        for (Ward value : ward) {
            sumSeats += value.seats;
            sumFreebunk += value.freebunk;
        }
        System.out.println("Всего мест: " + sumSeats + "\n Всего сободных: " + sumFreebunk);
    }
    public void setSeats(int seats){
        this.seats = seats;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setFreebunk(int freebunk){
        this.freebunk = freebunk;
    }
    public int getSeats () {
        return this.seats;
    }
    public String getSurname() {
        return this.surname;
    }
    public int getFreebunk(List<Ward> ward) {
        return this.freebunk;
    }
}

abstract class Pet {
    String name;
    int age;
    boolean hungry;
    abstract void voice();
    void food() {
        hungry = false;
    }
}

class Snake extends Pet {
    double length;
    void voice() {
        System.out.println("Я змея");
    }
}
