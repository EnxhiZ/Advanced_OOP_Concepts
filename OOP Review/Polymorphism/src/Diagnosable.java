public interface Diagnosable {
    double getTemperature();
/* TODO
Declare a hasFever method that returns true is the temperature
is greater than 100.4*/
    int getSystolic();
    int getDiastolic();
    void setTemperature(double var1);
    boolean hasFever();
/* TODO
Declare two setters. One for systolic and one for diastolic.
Check the getters to infer the parameter types.*/

    void setSystolic(int var1);

    void setDiastolic(int var1);
}
