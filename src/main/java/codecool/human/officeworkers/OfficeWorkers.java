package codecool.human.officeworkers;

import codecool.human.Human;

public abstract class OfficeWorkers implements Human {

    @Override
    public String playAnInstrument() {
        return "Tu turutu!";
    }

    @Override
    public abstract String sayThing();

}
