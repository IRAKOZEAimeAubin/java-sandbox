class Hello {
    public static void main(String a[]) throws ClassNotFoundException {
        // Mobile iPhone = new Mobile();
        // Mobile samsung = new Mobile();

        // Class.forName("Mobile");

        // Human human = new Human();
        // human.setAge(27);
        // human.setName("Aubin");

        // Human humanOne = new Human("Kari Nordmann");
        // humanOne.setAge(21);

        // System.out.println("Hello, my name is: " + human.getName() + " and I am: " +
        // human.getAge() + " years old!");
        // System.out.println("Hello, my name is: " + humanOne.getName() + " and I am: "
        // + humanOne.getAge() + " years old!");

        // Dog dog = new Dog("bark");

        AdvancedCalculator calculator = new AdvancedCalculator();
        int sum = calculator.add(36, 8);
        int difference = calculator.substract(16, 2);
        int product = calculator.multiply(9, 9);
        int quotient = calculator.divide(16, 4);
        int remainder = calculator.remainder(33, 32);
        System.out.println(remainder);
    }
}

class Mobile {
    int price;
    String brand;
    static String type;

    static {
        type = "Smartphone";
        System.out.println("in static block");
    }

    public Mobile() {
        price = 200;
        brand = "";
        System.out.println("in constructor block");
    }

}

class Human {
    private int age;
    protected String name;

    public Human() {
        age = 18;
        name = "Ola Nordmann";
    }

    public Human(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Animal {
    public Animal() {
        System.out.println("in Animal");
    }

    public Animal(String sound) {
        System.out.println("in Animal sound");
    }
}

class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("in Dog");
    }

    public Dog(String sound) {
        this();
        System.out.println("in Dog sound");
    }
}