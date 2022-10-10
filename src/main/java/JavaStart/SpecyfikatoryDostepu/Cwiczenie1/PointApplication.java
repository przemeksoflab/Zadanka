package JavaStart.SpecyfikatoryDostepu.Cwiczenie1;

import JavaStart.SpecyfikatoryDostepu.Cwiczenie1.Pakiet1.Point;
import JavaStart.SpecyfikatoryDostepu.Cwiczenie1.Pakiet2.PointController;

public class PointApplication {
    public static void main(String[] args) {
        PointController pc = new PointController();
        Point point = new Point(3,7);

        final int add_x = 2;
        final int minus_x = 1;
        final int add_y = 3;
        final int minus_y = 4;

        int option = add_x;

        switch (option){
            case add_x:
                pc.addX(point);
                break;
            case minus_x:
                pc.minusX(point);
                break;
            case add_y:
                pc.addY(point);
                break;
            case minus_y:
                pc.minusY(point);
                break;

        }



        System.out.println(point.getX() +";" + point.getY());
        pc.addX(point);
        System.out.println(point.getX() +";" + point.getY());
    }
}
