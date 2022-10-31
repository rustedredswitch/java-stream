import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        /*
         * All this four Comparators make identical results
         */

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


        // Lambads without parameters
        Runnable r = () -> { System.out.println("A compact Runnable");};
        Thread t1 = new Thread(r);

    }
}