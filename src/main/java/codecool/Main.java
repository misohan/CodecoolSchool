package codecool;

import codecool.human.mentors.RegularMentor;
import codecool.human.students.HungarianStudent;
import codecool.human.students.PolishStudent;
import codecool.human.students.Students;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ModuleRooms moduleRoom = new RegularMentor();

        List<Students> students = new ArrayList<>();
        students.add(new HungarianStudent("Patrik", "Xavier", true));
        students.add(new HungarianStudent("Angela", "Wave", false));
        students.add(new PolishStudent("Robert", "Mak", true));
        students.add(new PolishStudent("Aneta", "Herbata", true));
        students.add(new HungarianStudent("Atilla", "Vegh", true));
        students.add(new HungarianStudent("Martin", "Boraros", false));
        students.add(new HungarianStudent("Adam", "Opak", false));
        students.add(new PolishStudent("Klaudia", "Ladna", true));
        students.add(new HungarianStudent("Daniela", "Maslo", true));
        students.add(new HungarianStudent("Ildigo", "Abak", true));
        students.add(new HungarianStudent("Lajos", "Klein", true));
        students.add(new HungarianStudent("Zuzana", "Beta", true));

        students = moduleRoom.removeNotPresentStudents(moduleRoom.checkAttendance(students));

        for(Students student: students){
            System.out.println(student.getFirstName() + " " + student.getLastName() + " does " + student.playAnInstrument() + ", and say: " + student.sayThing());
        }
    }
}
