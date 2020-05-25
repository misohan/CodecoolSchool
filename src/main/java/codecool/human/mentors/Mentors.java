package codecool.human.mentors;

import codecool.ModuleRooms;
import codecool.human.Human;
import codecool.human.students.Students;

import java.util.Collections;
import java.util.List;

public abstract class Mentors implements Human, ModuleRooms {

    public String playAnInstrument() {
        return "Play the guitar";
    }

    public String sayThing() {
        return null;
    }


    @Override
    public List<Students> checkAttendance(List<Students> students) {
        Collections.sort(students);
        return students;
    }


}
