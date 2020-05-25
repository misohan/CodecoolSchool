package codecool;

import codecool.human.mentors.RegularMentor;
import codecool.human.students.HungarianStudent;
import codecool.human.students.PolishStudent;
import codecool.human.students.Students;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ModuleRooms moduleRooms = new RegularMentor();

        List<Students> students = new ArrayList<>();
        students.add(new HungarianStudent("Patrik", "Xavier"));
        students.add(new HungarianStudent("Angela", "Wave"));
        students.add(new PolishStudent("Robert", "Mak"));
        students.add(new PolishStudent("Aneta", "Herbata"));
        students.add(new HungarianStudent("Atilla", "Vegh"));
        students.add(new HungarianStudent("Martin", "Boraros"));
        students.add(new HungarianStudent("Adam", "Opak"));
        students.add(new PolishStudent("Klaudia", "Ladna"));
        students.add(new HungarianStudent("Daniela", "Maslo"));
        students.add(new HungarianStudent("Ildigo", "Abak"));
        students.add(new HungarianStudent("Lajos", "Klein"));
        students.add(new HungarianStudent("Zuzana", "Beta"));

        students = moduleRooms.checkAttendance(students);

        for(Students student: students){
            System.out.println(student.getFirstName() + " " + student.getLastName() + " does " + student.playAnInstrument() + ", and say: " + student.sayThing());
        }
    }
}
