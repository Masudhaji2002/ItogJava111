package Task1;

public class Calculator {
    public static void main(String[] args) {
        Presenter presenter = new Presenter();
        System.setProperty("java.util.logging.config.file", "logging.properties");
        presenter.start();


    }
}
