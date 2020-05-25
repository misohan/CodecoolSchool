package codecool.human.students;

import codecool.human.Human;

public abstract class Students implements Human {

    @Override
    public String playAnInstrument() {
        return "Wrrr!";
    }

    @Override
    public String sayThing() {
        return null;
    }
}
