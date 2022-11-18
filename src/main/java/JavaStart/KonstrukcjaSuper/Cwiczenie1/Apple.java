package JavaStart.KonstrukcjaSuper.Cwiczenie1;

public class Apple extends Fruit{
    private String typeOfApple = "jablkowaty";


    public Apple(int weightInG, String fruitType, String typeOfApple) {
        super(weightInG, fruitType);
        this.typeOfApple = typeOfApple;
    }
    public void getInfo() {
        super.getInfo();
        System.out.println("type is :" + typeOfApple);
    }
}
