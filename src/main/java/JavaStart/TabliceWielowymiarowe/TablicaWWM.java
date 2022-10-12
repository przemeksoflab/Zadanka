package JavaStart.TabliceWielowymiarowe;

public class TablicaWWM {
    public static void main(String[] args) {

        double[] firstRow = {1.0, 1.5, 2.0};
        double[] secondRow = {1.5, 2.0, 2.5};
        double[] thirdRow = {2.0, 2.5, 3.0};

        double[][] tab3x3 = {firstRow, secondRow, thirdRow};


        double sumaPrzekatnych = (firstRow[0] * secondRow[1] * thirdRow[2])+(firstRow[2] * secondRow[1] * thirdRow[0]);
        System.out.println(sumaPrzekatnych);
        double sumaSrodkowych = (firstRow[1] + secondRow[1] + thirdRow[1])*(secondRow[0] + secondRow[1] + secondRow[2]);
        System.out.println(sumaSrodkowych);
        double sumaBrzegów = firstRow[0] + firstRow[1] + firstRow[2] + secondRow[0] + secondRow[2] + thirdRow[0] + thirdRow[1] + thirdRow[2];
        System.out.println(sumaBrzegów);
    }


    }
