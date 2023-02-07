public class If {
    public static void printIf() {
        int amount = 10;
        if(amount != 10) {
            System.out.println("print true");
        } else if(amount <15){
            System.out.println("print true x2");
        } else {
            System.out.println("print false");
        }

        while(true) {
            if(amount >20) {
                break;
            }
            System.out.println(amount);

            amount++;
        }
    }
}