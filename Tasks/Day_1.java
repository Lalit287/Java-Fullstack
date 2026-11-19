
/*
Question: Employee Attendance Management

Scenario:
A company wants to identify employees who are
present and generate attendance reports.

Requirements:
1. Create a list of employee attendance percentages:
   95, 45, 80, 30, 100.

2. Use Predicate to check whether attendance is
   75% or above.

3. Use Consumer to print eligible attendance percentages.

4. Use forEach() to process the list.

Concepts:
List, Generics, Predicate, Consumer, Lambda,
forEach.
*/

import java.util.*;
import java.util.function.*;

class Main {
    public static void main(String[] args) {

        // Create a list of attendance percentages
        List<Integer> attendance =
            Arrays.asList(95, 45, 80, 30, 100);

        // Predicate to check attendance >= 75
        Predicate<Integer> eligible =
            a -> a >= 75;

        // Consumer to print attendance
        Consumer<Integer> print =
            a -> System.out.println(a + "%");

        System.out.println("Employee Attendance Report");
        System.out.println("Eligible Employees (75% or above):");

        // Process the list using forEach()
        attendance.forEach(a -> {
            if (eligible.test(a)) {
                print.accept(a);
            }
        });
    }
}
