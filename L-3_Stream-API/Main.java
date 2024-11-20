import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(12);
        list.add(2);
        list.add(24);
        list.add(4);

        Stream<Integer> stream =  list.stream();
        System.out.println(stream.count());
        list.stream().
                filter(a -> a%2==0).
                forEach(a -> System.out.println(a));

        list.stream().
                filter(a -> a%2==0).
                distinct().
                forEach(a -> System.out.println(a));


        list.stream().
                filter(a -> a%2==0).
                distinct().
                sorted((a,b) -> b-a).
                forEach(a -> System.out.println(a));

        list.stream().
                filter(a -> a%2==0).
                distinct().
                sorted((a,b) -> b-a).
                map(a -> a*2).
                forEach(a -> System.out.println(a));


        int sum = list.stream().
                filter(a -> a%2==0).
                distinct().
                map(a -> a*2).
                reduce(1,(a,b) -> a+b);

        System.out.println(sum);

        List<Integer> resList = list.stream().
                filter(a -> a%2==0).
                distinct().
                map(a -> a*2).
                collect(Collectors.toList());

        System.out.println(resList);


//        System.out.println(stream.count());

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1,"aman", 70000,"sde1","aman1@gmail.com","aman2@gmail.com"));
        empList.add(new Employee(2,"amit", 80000,"lead","amit1@gmail.com","amit2@gmail.com"));
        empList.add(new Employee(3,"varun", 90000,"sde1","varun11@gmail.com","varun91@gmail.com"));
        empList.add(new Employee(4,"rahul", 70000,"sde2","rahul@gmail.com","rahul12@gmail.com"));
        empList.add(new Employee(5,"aman", 70000,"sde1","aman15@gmail.com","aman25@gmail.com"));

        empList.stream().
                filter(a -> a.designation.equals("sde1")).
                forEach(a -> System.out.println(a));

        empList.stream().
                filter(a -> a.designation.equals("sde1")).
                distinct().
                forEach(a -> System.out.println(a));

        empList.stream().
                filter(a -> a.designation.equals("sde1")).
                distinct().
                sorted((a,b) -> b.salary-a.salary).
                forEach(a -> System.out.println(a));

        empList.stream().
                filter(a -> a.designation.equals("sde1")).
                distinct().
                sorted((a,b) -> b.salary-a.salary).
                map(a -> {
                    a.salary *=2;
                    return a;
                }).
                forEach(a -> System.out.println(a));

        Employee employee =  empList.stream().
                filter(a -> a.designation.equals("sde1")).
                distinct().
                map(a -> {
                    a.salary *=2;
                    return a;
                }).
                reduce(new Employee(0),(a,b) -> new Employee(a.salary + b.salary));

        System.out.println(employee.toString());
        List<Employee> employeeList =  empList.stream().
                filter(a -> a.designation.equals("sde1")).
                distinct().
                map(a -> {
                    a.salary *=2;
                    return a;
                }).
                collect(Collectors.toList());

        System.out.println(employeeList);


        List<ArrayList<String>> employeeList1 =  empList.stream().
                filter(a -> a.designation.equals("sde1")).
                distinct().
                map(a -> a.emails).
                collect(Collectors.toList());
        System.out.println(employeeList1);

        List<String> employeeList2 =  empList.stream().
                filter(a -> a.designation.equals("sde1")).
                distinct().
                flatMap(a -> a.emails.stream()).
                collect(Collectors.toList());

        System.out.println(employeeList2);
        
    }
}


