package Methods;

public class PC {
    public void volume(int maxVolume){
        System.out.println("Computer max volume is: " + maxVolume + " Hz");
    }
    public void display(String hd){
        System.out.println("Computer display is: " + hd);
    }

    public static void main(String[] args) {
        PC myPC = new PC();
        myPC.display("Full");
        myPC.volume(100);
    }
}
