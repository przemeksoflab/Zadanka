package JavaStart.TabliceJednowymiarowe.Cwiczenie1;

public class SumOfArrays {

    int sumMethods(int[] tab, int[] tabb) {
        int sum= 0;
        for (int k : tab) {
            sum += k;
        }
        for (int k : tabb) {
            sum += k;
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        int[] tab1 = new int[]{6,8,32};
        int[] tab2 = new int[]{76,78,2};
        int sum = 0;


        for (int k : tab1) {
            sum += k;
        }
        for (int j : tab2) {
            sum += j;
        }
        System.out.println(sum);

        SumOfArrays summm = new SumOfArrays();
        System.out.println(summm.sumMethods(new int[]{6,8,32},new int[]{76,78,2}));




    }
}
