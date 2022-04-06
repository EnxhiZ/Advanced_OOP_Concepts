public class Calculator {
    public DoMath toOperation(String op){
        DoMath res;
        switch (op) {
            case "+":
                res=  (o1, o2) -> o1 + o2;
                break;
            case "-":
                res= (o1, o2) -> o1 - o2;
                break;
            case "*":
                res = (o1, o2) -> o1 * o2;
                break;
            case "/":
                res = (o1, o2) -> o2 == 0 ? Double.POSITIVE_INFINITY : o1 / o2;
                break;
            default:
                res = (o1, o2) -> Double.MIN_VALUE;    }
        return res;
    }

    public Double compute(Double n1, Double n2, String op){
        DoMath calc = toOperation(op);
        return calc.compute(n1,n2);   }
}
