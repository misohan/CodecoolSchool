package codecool.human.students;

public class HungarianStudent extends Students{

    public HungarianStudent(String firstName, String lastName, boolean attendance) {
        super(firstName, lastName, attendance);
    }

    @Override
    public String sayThing() {
        return "egesz kerek";
    }
}
