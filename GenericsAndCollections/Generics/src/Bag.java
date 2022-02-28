import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bag<T> {
    ArrayList<T> objects;

    public Bag() {
        this.objects = new ArrayList<>();
    }

    public void add(T thing) throws BagException {
        if (thing != null)
            objects.add(thing);
        else
            throw new BagException("Cannot add null thing to bag");
    }

    public T drawOne() {
        int item = (int) (Math.random() + objects.size() - 1);
        return objects.get(item);
    }

    public ArrayList<T> drawMany(int howMany) {
        ArrayList<T> new_list = new ArrayList<>();
        for (int i = 0; i < howMany; i++)
        {
            new_list.add(drawOne());
        }
        return new_list;

    }

    public void add(T element, double prob) throws BagException {
        if (prob > 0 && prob < 1) {
            int tot = (int) Math.round(objects.size() * prob);
            for (int i = 0; i < tot; i++) {
                System.out.println("Adding " + i);
                objects.add(element);
            }
        } else
            throw new BagException("Probability should be between 0 and 1");


    }
}
