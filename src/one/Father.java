package one;

public class Father {
    protected String run ;
    protected String swim;

    public Father ( String run , String swim) {
        this.run = run;
        this.swim = swim;
    }

    public void drive(){
        System.out.println(" driving car.");
    }

    public void sleep(){
        System.out.println(" on the sleep.");
    }
}


