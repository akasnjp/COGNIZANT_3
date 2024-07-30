public class MobileApp implements Observer{
    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockData) {
        System.out.println(name + " received stock data: " + stockData);
    }
}
