public class CarApp {
    public static void print() {
        // access modifiers:
        // 1- public: can be accessed from anywhere within the app
        // 2- protected: only classes from the same package can access these
        // 3- default(lack of access modifier),
        // 4- private: can only be accessed from the class itself (not even from sub-class)

        Factory factory1 = new Factory();
        factory1.design();
        factory1.build();

        Car car1 = new Car();
        car1.build();
        car1.brand();
    }
}
