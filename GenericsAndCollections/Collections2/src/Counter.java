import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class Counter<E> {
    private HashMap<E, Integer> counts;

    public Counter(E[] things){
        counts = new HashMap<>();
        for(E thing: things) {
            if (counts.get(thing) != null) {
                int value = counts.get(thing);
                counts.replace(thing, value + 1);
            } else {
                counts.put(thing, 1);
            }
        }
    }

    public Integer getCount(E element)
    {
        return counts.get(element);
    }

    public int getSize(){
        return this.counts.size();
    }

    public E mostFrequent()
    {
        int n = 0;
        E key = null;
        for (Map.Entry<E, Integer> entry : counts.entrySet())
        {
            if (n < entry.getValue())
            {
                key = entry.getKey();
                n = entry.getValue();
            }
        }
        return key;
    }
}
