// A sample program to create different objects through methods.
class Mango {
    public void Season() {
        System.out.println("Mango is the King of fruits.");
        System.out.println("It is available during Summer Season.");
    }
}
class Apple {
    public void Season() {
        System.out.println("Apples are produced in Kashmir.");
        System.out.println("They are available during Winter season.");
    }
}
class Grape {
    public void Season() {
        System.out.println("Grapes are produced in Maharashtra.");
        System.out.println("They are available during Winter season.");
    }
}
public class Fruits {
    public static void main(String[] args) {
        Mango fruit1=new Mango();
        Apple fruit2=new Apple();
        Grape fruit3=new Grape();
        fruit1.Season();
        fruit2.Season();
        fruit3.Season();
    }
}