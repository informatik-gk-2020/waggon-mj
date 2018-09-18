package waggon;

import basis.Stift;

public class Waggon {

    public void draw(int x, int y, Stift stift) {
        stift.bewegeBis(100, 100);
        puffer(stift);
        stift.hoch();

        stift.dreheUm(90);
        stift.bewegeUm(20);
        stift.runter();
        stift.dreheUm(270);
        stift.zeichneRechteck(100, 40);
        stift.radiere();
        stift.bewegeUm(100);

        stift.normal();
        stift.hoch();
        stift.bewegeUm(15);
        stift.dreheUm(-90);
        stift.bewegeUm(20);
        stift.dreheUm(270);
        puffer(stift);

    }

    public void puffer(Stift stift) {
        stift.dreheUm(90);
        stift.bewegeUm(5);
        stift.runter();
        stift.dreheUm(180);
        stift.bewegeUm(10);
        stift.hoch();
        stift.dreheUm(180);
        stift.bewegeUm(5);
        stift.dreheUm(-90);
        stift.runter();
        stift.bewegeUm(15);
    }
}
