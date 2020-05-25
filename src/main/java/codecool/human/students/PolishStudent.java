package codecool.human.students;

public class PolishStudent extends Students {

    public PolishStudent(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String playAnInstrument() {
        return super.playAnInstrument();
    }

    @Override
    public String sayThing() {
        return "I'd like to drink a beer";
    }
}
