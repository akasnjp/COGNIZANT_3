public class LoggerTest  {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This is the first log message");
        
        logger2.log("This is the second");

        if(logger1 == logger2){
            System.out.println("Both logger1 and logger2 refers to same instance");
        }
        else{
            System.out.println("Not from same instance");
        }
    }
}
