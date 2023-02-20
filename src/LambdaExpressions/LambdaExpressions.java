package LambdaExpressions;

interface FunctionalInterface {
    int start(int value1, int value2);
}

interface SecondFunctionalInterface {
    String start(String value);
}

class Car {
    public void drive(FunctionalInterface obj) {
        System.out.println("Drive");
        int number = obj.start(18,2);
        System.out.println("number : " + number);
    }

    public void bazinga(SecondFunctionalInterface obj) {
        String text = obj.start("Zimbabwe");
        System.out.println(text);
    }
}

public class LambdaExpressions {
    public void print() {
        Car car1 = new Car();
        // passing an anonymous class
        car1.drive(new FunctionalInterface() {
            @Override
            public int start(int value1,int value2) {
                return value1*value2;
            }
        });

        // This is lambda expression
        car1.drive((value1,value2)->value1*value2);

        car1.bazinga(new SecondFunctionalInterface() {
            @Override
            public String start(String value) {
                return value + " is the best country";
            }
        });

        car1.bazinga(value->value+" is the best country");

        System.out.println("LambdaExpressions");

    }
}
