package JavaStart.PrzeciazenieMetodISlowoThis.Cwiczenie1;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add(5,6);
        System.out.println(calc.result);
        calc.add(7,5,6);
        System.out.println(calc.result);
    }
}
