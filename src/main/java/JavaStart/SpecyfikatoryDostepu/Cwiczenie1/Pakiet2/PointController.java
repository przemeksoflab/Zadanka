package JavaStart.SpecyfikatoryDostepu.Cwiczenie1.Pakiet2;

import JavaStart.SpecyfikatoryDostepu.Cwiczenie1.Pakiet1.Point;

public class PointController {
    Point point;

    public void addX(Point point) {
        this.point = point;
        point.setX(point.getX()+1);
    }
    public void minusX(Point point) {
        this.point = point;
        point.setX(point.getX()-1);
    }
    public void addY(Point point) {
        this.point = point;
        point.setY(point.getY()+1);
    }
    public void minusY(Point point) {
        this.point = point;
        point.setY(point.getY()-1);
    }
}
