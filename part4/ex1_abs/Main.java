package essential.part4.ex1_abs;

public class Main {
    public static void main(String[] args) {
// no       Bird b = new    Bird()    ; //b.move
        Bird p = new Penguin(); // полиморфная ссылка
        Bird s = new Strauss();
        Bird sw = new Swallow();

        p.move();
        s.move();
        sw.move();


    }
}
