import java.util.LinkedList;

public class StackCalculator {
    private LinkedList<Double> calculator;
    public StackCalculator(){
        calculator = new LinkedList<>();

    }

    public void push(double x){
        if (calculator == null) return;

        calculator.push(x);
    }

    public Double pop(){
        if (calculator == null || calculator.isEmpty()) return null;
         return calculator.pop();
    }

    public Double add(){
        if (calculator == null || calculator.size() < 2) return null;

        Double item1 = calculator.pop();
        Double item2 = calculator.pop();
        Double result = item1+item2;
        calculator.push(result);
        return result;
    }

    public Double subtract() {
        if (calculator == null || calculator.size() < 2) return null;

        Double item1 = calculator.pop();
        Double item2 = calculator.pop();
        Double result = item1 - item2;
        calculator.push(result);
        return result;
    }

    public Double multiply(){
        if (calculator == null || calculator.size() < 2) return null;

        Double item1 = calculator.pop();
        Double item2 = calculator.pop();
        Double result = item1 * item2;
        calculator.push(result);
        return result;
    }

    public Double divide(){
        if (calculator == null || calculator.size() < 2) return null;

        Double item1 = calculator.pop();
        Double item2 = calculator.pop();
        Double result = item1 / item2;
        calculator.push(result);
        return result;
    }

    public Double sqrt(){
        if (calculator == null) return null;

        Double item1 = calculator.pop();
        Double result = Math.sqrt(item1);
        calculator.push(result);
        return result;
    }

    public Double pow(){
        if (calculator == null || calculator.size() < 2) return null;

        Double item1 = calculator.pop();
        Double item2 = calculator.pop();
        Double result = Math.pow(item1, item2);
        calculator.push(result);
        return result;
    }

    public void clear(){
        int i = calculator.size();
        if (calculator != null){
            do {
                calculator.pop();
                i--;
            } while (i > 0);
        }
    }

    public Double[] getValues() {
        if (calculator.size() > 0) {
            Double[] vals = new Double[calculator.size()];
            for (int i = 0; i < calculator.size(); i++) {
                vals[i] = calculator.get(i);
            }
            return vals;
        }
        else {
            System.out.println("Empty Stack");
            return null;
        }
    }

    public int size(){
        return calculator.size();
    }

    public void printContents(Double[] x) {
        for (Double aX : x) {
            System.out.println(aX);
        }
    }
}
