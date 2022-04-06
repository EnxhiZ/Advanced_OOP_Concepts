import java.time.LocalDate;
import java.time.Period;

public class Person {

    private String name;
    private LocalDate birthDate;

    private class Position {
        protected String name;
        protected double salary;

        private Position(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return name + ": " + salary;
        }
    }

    private Position position;

    public Person(String name, String birthday) {
        this.name = name;
        this.birthDate = LocalDate.parse(birthday);
    }

    public int getAge() {
        Period age = Period.between(LocalDate.now(), this.birthDate);
        return Math.abs(age.getYears());
    }

    public void setPosition(String title, double salary) {
        position = new Position(title, salary);
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return this.name + " " +
                this.getAge() + " " +
                getPosition().toString();
    }
}