import java.util.Comparator;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        // Anonymus class
        Comparator<Employee> byName = new Comparator<Employee>() {
            @Override
            public int compare(Employee a, Employee b) {
                return a.getName().compareTo(b.getName());
            }
        };

        // Lambads
        Comparator<Employee> byNameLambda1 = (Employee a, Employee b) -> {return a.getName().compareTo(b.getName());};
        Comparator<Employee> byNameLambda2 = (a, b) -> {return a.getName().compareTo(b.getName());};
        Comparator<Employee> byNameLambda3 = (a, b) -> a.getName().compareTo(b.getName());
        int compare1 = byNameLambda3.compare(new Employee("gino", 1), new Employee("romeo", 2));
        System.out.println(compare1);

        // Lambads without parameters
        Runnable r = () -> { System.out.println("A compact Runnable");};
        Thread t1 = new Thread(r);

        // Lambdas use only one object Consumer<String> ( Anonymus classes use 5 onces in this example)
        System.out.println("\nNon-capturing lambda:");
        for (int i=0; i<5; i++) {
            Consumer<String> myPrinter= msg -> System.out.println("Consuming " + msg);
            myPrinter.accept(myPrinter.toString());
        }
    }
}