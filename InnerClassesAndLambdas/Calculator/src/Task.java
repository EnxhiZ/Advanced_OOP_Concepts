import java.util.ArrayList;
import java.util.List;

public class Task {
    public static class Triplet<T1, T2, T3> {
        public T1 num1;
        public T2 num2;
        public T3 num3;

        public Triplet(T1 num1, T2 num2, T3 num3) {
            this.num1 = num1;
            this.num2 = num2;
            this.num3 = num3;
        }
    }

    public static String result;
    public static void main(String[] args){
        Calculator c = new Calculator();
        List<Triplet<Double,Double,String>> num = new ArrayList<>();
        num.add(new Triplet<>(3.4,5.2,"+"));
        num.add(new Triplet<>(2.3,1.23,"-"));
        num.add(new Triplet<>(4.5, 5.4, "*"));
        num.add(new Triplet<>(8.0, 0.0, "/"));
        num.add(new Triplet<>(56.0, 28.0, "/"));

        num.forEach(item -> result += "\n" + c.compute(item.num1, item.num2, item.num3));
        System.out.println(result);
    }
}