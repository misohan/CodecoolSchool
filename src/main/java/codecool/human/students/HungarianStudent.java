package codecool.human.students;

public class HungarianStudent extends Students{

    public HungarianStudent(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String playAnInstrument() {
        return super.playAnInstrument();
    }

    @Override
    public String sayThing() {
        return "egesz kerek";
    }
}
