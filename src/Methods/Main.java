package Methods;

public class Main {
    static void myStaticMethod(){
        System.out.println("Statik metodlarni ob'ektlar yaratmasdan chaqirish mumkin");
    }

    public void myPublicMethod() {
        System.out.println("Public methodlar ob'ektlarni yaratish orqali chaqirilishi kerak");
    }

    public static void main(String[] args) {
        myStaticMethod();
        Main object = new Main();
        object.myPublicMethod();
    }
}


