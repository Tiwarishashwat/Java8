import java.lang.annotation.*;

@admin(name = "aman",id=2)
@admin(name = "shashwat")
@print(times = 2)
public class Pencil {

    @dontPrint
    public void write(){
        System.out.println("I am writing");
    }
    public void printBrand(){
        System.out.println("I am non-branded");
    }

    @Deprecated
    public boolean isSharpened(){
        return false;
    }
}

class Natraj extends Pencil{

}

class Apsara extends Pencil{
    @Override
    public void printBrand(){
        System.out.println("I am Apsara");
    }

}

@FunctionalInterface
interface Eraser {
    public void erase();
//    public void printName();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface dontPrint {

}

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
@interface print {
 int times() default 1;
}

@Repeatable(adminContainer.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
@interface admin{
    String name();
    int id() default 1;
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
@interface adminContainer{
    admin[] value();
}




