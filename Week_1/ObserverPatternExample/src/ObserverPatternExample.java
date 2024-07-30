public class ObserverPatternExample {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("MobileApp");
        Observer webApp = new WebApp("WebApp");

        stockMarket.register(mobileApp);
        stockMarket.register(webApp);

        stockMarket.setStockData("Stock data updated to 100");

        stockMarket.deregister(webApp);

        stockMarket.setStockData("Stock data updated to 200");
    }
}
