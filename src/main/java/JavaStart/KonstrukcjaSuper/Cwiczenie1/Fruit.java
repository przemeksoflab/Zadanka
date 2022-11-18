package JavaStart.KonstrukcjaSuper.Cwiczenie1;

public class Fruit {
    private int weightInG;
    private String fruitType;

    public Fruit(int weightInG, String fruitType) {
        this.weightInG = weightInG;
        this.fruitType = fruitType;
    }

    public int getWeightInG() {
        return weightInG;
    }

    public void setWeightInG(int weightInG) {
        this.weightInG = weightInG;
    }

    public String getFruitType() {
        return fruitType;
    }

    public void setFruitType(String fruitType) {
        this.fruitType = fruitType;
    }

    public void getInfo() {
        System.out.println("this is " + getFruitType() + ". It's weight is: " + getWeightInG());
    }
}
