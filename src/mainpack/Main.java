package mainpack;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Ward firstpalat = new Ward(5, "Dr. Matveev", 1);
        System.out.println(firstpalat.getSurname());
        firstpalat.print();
        Ward secondpalat = new Ward();
        secondpalat.setSeats(10);
        secondpalat.setFreebunk(2);
        secondpalat.setSurname("Dr. Laker");
        List<Ward> ward = new ArrayList<>();
        ward.add(firstpalat);
        ward.add(secondpalat);
        firstpalat.HuwMuchFree(ward);
    }
}


