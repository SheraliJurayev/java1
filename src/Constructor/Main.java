package Constructor;

public class Main {
    int x;

    public Main(int y){
         x = y;
    }

    public static void main(String[] args) {
        Main obj = new Main(7);
        System.out.println(obj.x);
    }
}
