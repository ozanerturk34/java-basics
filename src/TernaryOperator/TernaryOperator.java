package TernaryOperator;

public class TernaryOperator {
    private static TernaryOperator obj;

    private TernaryOperator() {};

    public static TernaryOperator getTernaryOperator() {
        if(obj == null) {
            obj = new TernaryOperator();
        }
        return obj;
    }

    public static void print() {
        System.out.println(false ? "false" :"True");
        System.out.println(true ? "True" :"false");

        int number = 10;

        number = number > 20 ? number : 20;
        System.out.println(number);

        int[] numbers = {11,2,3,4,5,6,10,20,50};
        int lowestNum = Integer.MAX_VALUE;
        for(int currentNumber : numbers) {
            lowestNum = currentNumber < lowestNum ? currentNumber : lowestNum;
        }
        System.out.println(lowestNum);
    };
}
