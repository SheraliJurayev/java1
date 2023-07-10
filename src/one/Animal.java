package one;

class Animal {
    protected String type ;
    protected int age ;

    public Animal (String type , int age){
        this.age = age;
        this.type = type;
    }
    public void eat(){
        System.out.println(type + "eating food.");
    }
    public void sleep(){
        System.out.println(type + "slepping.");
    }
}
