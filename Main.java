abstract class Car {
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("Playing: Strawberry letter 23 - Shuggie Otis");
    }
}

abstract class LandCruiser extends Car {
    public void drive() {
        System.out.println("Driving...");
    }
}

class Series10k extends LandCruiser {
    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}

class OuterClass {
    private int outerField = 77;
    private static int staticOuterField = 81;

    public class InnerClass {
        public void accessOuterMembers() {
            // Can access both static and non-static members of the outer class
            System.out.println("Outer field: " + outerField);
            System.out.println("Static outer field: " + staticOuterField);
        }
    }

    public static class StaticInnerClass {
        public void accessOuterMembers() {
            // Can only access static members of the outer class
            // System.out.println("Outer field: " + outerField); // Compilation error
            System.out.println("Static outer field: " + staticOuterField); // Works fine
        }

        // To access non-static members, needs an explicit reference
        public void accessWithReference(OuterClass outer) {
            System.out.println("Outer field: " + outer.outerField);
        }
    }
}

public class Main {
    public static void main(String a[]) {
        // Car obj = new Series10k();
        // obj.drive();
        // obj.playMusic();
        // obj.fly();

        Car car = new Car() {

            @Override
            public void drive() {
                System.out.println("Driving fast...");
            }

            @Override
            public void fly() {
                System.out.println("Flying at supersonic speed...");
            }
            
        };

        // For non-static inner class, we need an outer instance first
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        // innerObj.accessOuterMembers();

        // For static inner class, no outer instance is needed
        OuterClass.StaticInnerClass staticInnerObj = new OuterClass.StaticInnerClass();
        // staticInnerObj.accessOuterMembers();
        // staticInnerObj.accessWithReference(outerObj);
    }
}
