package codecool.human.students;

import codecool.human.Human;

public abstract class Students implements Human, Comparable<Students> {
    private String firstName;
    private String lastName;

    public Students(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String playAnInstrument() {
        return "Wrrr!";
    }

    @Override
    public String sayThing() {
        return null;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public int compareTo(Students student) {
        if (getLastName() == null || student.getLastName() == null) {
            return 0;
        }
        return getLastName().compareTo(student.getLastName());
    }
}
