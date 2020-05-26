package codecool.human.students;

import codecool.human.Human;

public abstract class Students implements Human, Comparable<Students> {
    private String firstName;
    private String lastName;
    private boolean attendance;

    public Students(String firstName, String lastName, boolean attendance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.attendance = attendance;
    }

    @Override
    public String playAnInstrument() {
        return "Wrrr!";
    }

    @Override
    public abstract String sayThing();

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

    public boolean isAttendance() {
        return attendance;
    }
}
