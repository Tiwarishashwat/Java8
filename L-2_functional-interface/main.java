import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
//        --- Functional Interfaces ---
//        Consumer<T> -> take input, modify , no output, method: void accept(T t);
//        Predicate<T> -> take input, modify, boolean output, method: boolean test(T t);
//        Function<T,R> -> take input T, modify, R output, method: R apply(T t);
//        Supplier<T> -> no input, T output, method: T get();
//        --- Functional Interfaces ---

        Consumer<Integer> consumer1 = (n) -> System.out.println(n);
        consumer1.accept(10);

        Consumer<Student> consumer2 = (n) -> {
            n.setName("shashwat");
            System.out.println(n.name);
        };
        Student s1 = new Student();
        consumer2.accept(s1);

        Predicate<Integer> predicate1 = (n) -> n%2==0;
        System.out.println(predicate1.test(7));

        Predicate<Student> predicate2 = (n) ->{
          if (n.name.length()%2==0){
              return true;
          }
          return false;
        };
        Student s2 = new Student("ayush");
        System.out.println(predicate2.test(s2));


        Function<Integer,String> function1 = (n) -> {
            if (n%2==0){
                return "EVEN";
            }
            return "ODD";
        };

        System.out.println(function1.apply(5));

        Function<Student,String> function2 = (n) -> {
            if (n.name.length()%2==0){
                return "EVEN";
            }
            return "ODD";
        };
        Student s3 = new Student("Rahul");
        System.out.println(function2.apply(s3));

        Supplier<Student> supplier = () -> new Student("chaman");
        Student s4 =  supplier.get();
        System.out.println(s4.name);







    }
}


