import java.util.ArrayList;

public class AdultPatient extends Person implements Diagnosable, Employable {
    int systolic;
    int diastolic;
    double temperature;
    ArrayList<String> jobs;

    public AdultPatient() {
    }

    public ArrayList<String> getPreviousJobs() {
        return this.jobs;
    }

    public void addJob(String job) {
        if (this.jobs == null) {
            this.jobs = new ArrayList();
        }

        this.jobs.add(job);
    }

    public boolean hasFever() {
        return this.temperature > 100.4D;
    }

    public int getSystolic() {
        return this.systolic;
    }

    public int getDiastolic() {
        return this.diastolic;
    }

    public void setTemperature(double t) {
        this.temperature = t;
    }

    public double getTemperature() {
        return this.temperature;
    }

    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }
}

        /* TODO
Implement the class Adult Patient.
An adult patient is a Person that is Diagnosable and that is Employable.*/