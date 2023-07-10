package one;

class Rabbit extends Animal {
    public Rabbit(String type , int age) {
        super(type,age);
    }
    public void air(){
        System.out.println(type + " to breathe");
    }

}
