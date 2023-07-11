package one;

class Shark extends Animal {

    public Shark(String type, int age) {

        super(type, age);
    }

    public void swim() {
        System.out.println(type + " swimming in water");
    }
}
