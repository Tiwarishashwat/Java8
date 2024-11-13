import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
         Shape s = new Square();
         s.printName();
        //lambda
        Shape s1 = () -> System.out.println("I am triangle");
        Shape s2 = () -> System.out.println("I am Square");
        Shape s3 = () -> {
            System.out.println("I am Rectangle");
            System.out.println("I am Rhombus");
            System.out.println("I am Trapezium");
        };
        s3.printName();

        s1.printName();
        s2.printName();


        Calculator c = (a,b) -> {
            return a*b;
        };
        System.out.println("Multiplication: " + c.solve(5,7));
        //Add
        Calculator c1 = (a,b) -> {
            return a+b;
        };
        System.out.println("Addition: " + c1.solve(5,7));

        Calculator c2 = (a,b) -> a+b;
        System.out.println("Addition: " + c2.solve(15,7));

        Number n1 = n -> {
          if (n%2==0){
              System.out.println("EVEN");
          }else{
              System.out.println("ODD");
          }
        };
        n1.printType(8);

        //Collections
//        increasing
        TreeMap<Integer,Integer> map = new TreeMap<>((a,b) -> b-a);
        map.put(7,1);
        map.put(77,1);
        map.put(177,1);
        map.put(17,1);
        System.out.println(map);

//        Comparator
//        Compare ? fi -> IMPLEMENT
//        PriorityQueue + Custom Class -> sort using lambda

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(12);
        list.add(51);
        list.forEach( x -> System.out.println(x) );

// Consumer
//        Serialize / Threading






    }
}
