package JavaStart.SpecyfikatoryDostepu.Cwiczenie1;

import JavaStart.SpecyfikatoryDostepu.Cwiczenie1.Pakiet1.Point;
import JavaStart.SpecyfikatoryDostepu.Cwiczenie1.Pakiet2.PointController;

public class PointApplication {
    public static void main(String[] args) {
        PointController pc = new PointController();
        Point point = new Point(3,7);

        System.out.println(point.getX() +";" + point.getY());
        pc.addX(point);
        System.out.println(point.getX() +";" + point.getY());
    }
}
