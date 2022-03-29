public class Racer implements Runnable{
    Car c;
    int distance = 1000; // this is a racer that is going to run 1000 miles.

    public Racer(Car c) {
        this.c = c;
    }

    @Override
    public void run() {
        try {
            while (this.c.odometer <= distance) {
                if (this.c.miles == 0) {
                    long rechargeTime = (long) this.c.maxMiles;
                    Thread.sleep(rechargeTime);
                    this.c.charge();
                }
                this.c.move(1);

            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(this.c.name);
    }
}
