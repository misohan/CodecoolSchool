package codecool.human.mentors;

import codecool.ModuleRooms;
import codecool.human.Human;
import codecool.human.students.Students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Mentors implements Human, ModuleRooms {

    public String playAnInstrument() {
        return "Play the guitar";
    }

    @Override
    public abstract String sayThing();

    @Override
    public List<Students> checkAttendance(List<Students> students) {
        Collections.sort(students);
        return students;
    }
    public List<Students> removeNotPresentStudents(List<Students> students){
        List<Students> presentStudents = new ArrayList<>();
        for(Students student: students){
            if (student.isAttendance()){
                presentStudents.add(student);
            }
        }
        return presentStudents;
    }

}
