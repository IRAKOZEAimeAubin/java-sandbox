class Hello {
    public static void main(String a[]) throws ClassNotFoundException {
        // Mobile iPhone = new Mobile();
        // Mobile samsung = new Mobile();

        // Class.forName("Mobile");

        Human human = new Human();
        human.setAge(27);
        human.setName("Aubin");

        System.out.println("Hello, my name is: " + human.getName() + " and I am: " + human.getAge() + " years old!");
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