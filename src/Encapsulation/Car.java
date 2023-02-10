package Encapsulation;

public class Car {
    public static final int speed = 2;
    private String type;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    private int calculateIncome() {
        return 12000;
    }
    public String getRevenueData() {
        return "Revenue: "+ calculateIncome();
    }
}
