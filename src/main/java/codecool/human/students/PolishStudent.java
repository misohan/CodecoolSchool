package codecool.human.students;

public class PolishStudent extends Students {

    public PolishStudent(String firstName, String lastName, boolean attendance) {
        super(firstName, lastName, attendance);
    }

    @Override
    public String sayThing() {
        return "I'd like to drink a beer";
    }
}
