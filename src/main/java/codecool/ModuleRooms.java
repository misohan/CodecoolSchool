package codecool;

import codecool.human.students.Students;
import java.util.List;

public interface ModuleRooms {
    List<Students> checkAttendance(List<Students> students);
    List<Students> removeNotPresentStudents(List<Students> students);
}
