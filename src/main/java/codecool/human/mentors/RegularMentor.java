package codecool.human.mentors;

import codecool.human.students.Students;
import java.util.List;

public class RegularMentor extends Mentors{

    @Override
    public String playAnInstrument() {
        return super.playAnInstrument();
    }

    @Override
    public String sayThing() {
        return "Did you Google it?";
    }

    @Override
    public List<Students> checkAttendance(List<Students> students) {
        return super.checkAttendance(students);
    }
}
