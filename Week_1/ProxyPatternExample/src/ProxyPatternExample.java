public class ProxyPatternExample {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("test_image1.jpg");
        Image image2 = new ProxyImage("test_image2.jpg");
        image1.display();
        image1.display();
        image2.display();
        image2.display();
}
}
