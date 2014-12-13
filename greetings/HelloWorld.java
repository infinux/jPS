package greetings;
import printing.Printer;

public class HelloWorld {
    //private static int age = 50;
    public static void main(String[] args) {
        Printer myPrinter = new Printer(true, "MyPrinter");
        Printer yourPrinter = new Printer(false, "YourPrinter");

        myPrinter.print(3);
        String modNumber = yourPrinter.getModelNumber();
        yourPrinter.print(1);
        System.out.println("your model number: " + modNumber);
        myPrinter.printColors();

    }


}