import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static Map getEmp(List<Employee> empList){

        Map<String,List<Employee>> map= new HashMap<>();

        map =empList.stream().
                sorted(Comparator.comparing(Employee::getAge).reversed()).
                collect(Collectors.groupingBy(Employee::getDepartment));

        return map;

    }

    public static void main(String[] args) {



    //1) Write a function that takes a list of employees and
    //returns a map where the keys are departments,
        // and the values are lists of employees sorted by their age in descending order.




    List<Employee> employee = Arrays.asList(
            new Employee("Alice", 28, 60000, "HR"),
            new Employee("Bob", 35, 75000, "Engineering"),
            new Employee("Charlie", 32, 90000, "Engineering"),
            new Employee("David", 40, 80000, "HR"),
            new Employee("Eva", 28, 70000, "Finance"),
            new Employee("Frank", 45, 95000, "Finance")
    );

        Map<String,List<Employee>> map=getEmp(employee);

        System.out.println(map);



    }


}
