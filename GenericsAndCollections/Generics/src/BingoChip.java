
public class BingoChip<T1, T2>
{
    T1 obj1;
    T2 obj2;

    public BingoChip(T1 obj1, T2 obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public String toString() { return "Chip" + this.obj1 + " " + this.obj2;}
}

