package pl.camp.it;

public interface MojInterfejs {

    int a = 6;
    String b = "yjgdf";

    void abc();
    void mojaMetoda(int a);

    default void metodaJakas() {
        System.out.println("jakaś metoda !!");
    }

    default void useMethod() {
        System.out.println("jasgd");
    }
}
