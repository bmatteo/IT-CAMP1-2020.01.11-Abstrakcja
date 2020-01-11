package pl.camp.it;

public class ImplementacjaMojegoInterfejsu implements
        MojInterfejs, MojInterfejs2 {

    @Override
    public void abc() {

    }

    @Override
    public void mojaMetoda(int a) {

    }

    @Override
    public void metodaJakas() {
        MojInterfejs.super.metodaJakas();
        MojInterfejs2.super.metodaJakas();
    }

    @Override
    public void useMethod() {
        MojInterfejs.super.useMethod();
    }

    public void metoda1() {
        MojInterfejs.super.metodaJakas();
    }

    public void metoda2() {
        MojInterfejs2.super.metodaJakas();
    }
}
