public class Task {
    Person[] patients = new Person[5];
    public static void main(String[] args) {
        Task t = new Task();
        t.run();
    }

    public void run(){
        Person bart = new ChildPatient();
        Diagnosable lisa = new ChildPatient();
        ChildPatient maggie = new ChildPatient();
        AdultPatient homer = new AdultPatient();
        Employable marge = new AdultPatient();

        // Set the temperature of each child.
        /* TODO
Set the temperature of bart to 101.2, maggie 100.1, and lisa 100.6 */

        ((ChildPatient) bart).setTemperature(101.2D);
        maggie.setTemperature(100.1D);
        lisa.setTemperature(100.6D);
        // set the jobs
        /* TODO
Add the following jobs for homer: Nuclear Engineer, Major and Bar Owner.
For marge only one job: Hose Keeper. */
        homer.addJob("Nuclear Engineer");
        homer.addJob("Major");
        homer.addJob("Bar Owner");
        marge.addJob("Hose Keeper");

        //insert all of the sympsons in the patients array.
        /* TODO
Insert the Simpsons in the Patients' array: in the following order:
bart, lisa, maggie, homer and marge. */
        this.patients[0] = bart;
        this.patients[1] = (ChildPatient)lisa;
        this.patients[2] = maggie;
        this.patients[3] = homer;
        this.patients[4] = (AdultPatient)marge;
    }

    public boolean isAdult(Person p){
        return p instanceof Employable;
    }
}