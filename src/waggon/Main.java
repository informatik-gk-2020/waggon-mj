package waggon;

import basis.Fenster;
import basis.Stift;

public class Main {
    public static void main(String[] args) {
        var fenster = new Fenster(800, 600);
        var stift = new Stift();

        var waggon = new Waggon();
        waggon.draw(0, 100, stift);
    }
}
