package EnumsAdvancedUsage;

public class EnumsAdvancedUsage {
    public void print() throws IllegalStateException {
        Color color = Color.RED;
        switch(color) {
            case GREEN:
                System.out.println("GREEN");
                break;
            case RED:
                System.out.println("RED");
                break;
            case BLUE:
                System.out.println("BLUE");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + color);
        }
        System.out.println(Color.GREEN);
        System.out.println(Color.GREEN instanceof Color);
        System.out.println(color.getMeaning());

        Color color1 = Color.valueOf("RED");
        System.out.println(color1);

    }
}
