import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Pencil pencil = new Pencil();
        System.out.println(pencil.isSharpened());
        @SuppressWarnings("unused")
        Natraj natraj = new Natraj();

        Apsara apsara = new Apsara();
        apsara.printBrand();


        Method methods[] = pencil.getClass().getDeclaredMethods();
        for(Method method : methods){
            if(!method.isAnnotationPresent(dontPrint.class)){
                try {
                    method.invoke(pencil);
                }catch (Exception e){
                    System.out.println(e);
                }
            }

        }

        if(pencil.getClass().isAnnotationPresent(print.class)){
            print annotation = pencil.getClass().getAnnotation(print.class);
            System.out.println("pencil times: " + annotation.times());
        }

        if(apsara.getClass().isAnnotationPresent(print.class)){
            print annotation = apsara.getClass().getAnnotation(print.class);
            System.out.println("apsara times: " + annotation.times());
        }else{
            System.out.println("times is not present");
        }


        Pencil pencil1 = new Pencil();
        admin admins[] = pencil1.getClass().getAnnotationsByType(admin.class);
        for(admin a : admins){
            System.out.println("admin name: " + a.name() + " , " + "admin id: " + a.id());
        }




    }
}







// SuppressWarnings params ->
//        Cast         	Suppress the warning while casting from a generic type to a nonqualified type or the other way around.
//        Deprecation   	Ignores when we’re using a deprecated(no longer important) method or type.
//        divzero	Suppresses division by zero warning.
//        empty	Ignores warning of a statement with an empty body.
//        unchecked	 It doesn’t check if the data type is Object or primitive.
//        fallthrough	 Ignores fall-through on switch statements usually (if “break” is missing).
//        hiding	 It suppresses warnings relative to locals that hide variable
//        serial	It makes the compiler shut up about a missing serialVersionUID.
//        finally	Avoids warnings relative to finally block that doesn’t return.
//        unused	To suppress warnings relative to unused code.











//    @Deprecated annotation indicates that the marked element
//    is deprecated and should no longer be used.

//    @Override annotation informs the compiler that the element
//    is meant to override an element declared in a superclass

//    @SuppressWarnings annotation tells the compiler
//    to suppress specific warnings that it would otherwise generate.

//    @FunctionalInterface annotation, introduced in Java SE 8,
//    indicates that the type declaration is intended to be a
//    functional interface

//    @Retention annotation specifies how the marked annotation is stored:
//        RetentionPolicy.SOURCE – The marked annotation is retained only
//        in the source level and is ignored by the compiler.

//        RetentionPolicy.CLASS – The marked annotation is retained by the
//        compiler at compile time, but is ignored by the Java Virtual Machine (JVM).

//        RetentionPolicy.RUNTIME – The marked annotation is retained by the
//        JVM so it can be used by the runtime environment.

//    @Documented annotation indicates that whenever the specified
//    annotation is used those elements should be documented using
//    the Javadoc tool.

//    @Target annotation marks another annotation to restrict what kind of Java
//    elements the annotation can be applied to.
//    A target annotation specifies one of the following element types as its value:

//        ElementType.ANNOTATION_TYPE can be applied to an annotation type.
//        ElementType.CONSTRUCTOR can be applied to a constructor.
//        ElementType.FIELD can be applied to a field or property.
//        ElementType.LOCAL_VARIABLE can be applied to a local variable.
//        ElementType.METHOD can be applied to a method-level annotation.
//        ElementType.PACKAGE can be applied to a package declaration.
//        ElementType.PARAMETER can be applied to the parameters of a method.
//        ElementType.TYPE can be applied to any element of a class.

//    @Inherited annotation indicates that the annotation type
//    can be inherited from the super class.
//    (This is not true by default.)
//    When the user queries the annotation type and the class
//    has no annotation for this type, the class' superclass is
//    queried for the annotation type. This annotation applies
//    only to class declarations.

//    @Repeatable annotation, introduced in Java SE 8,
//    indicates that the marked annotation can be applied more than once
//    to the same declaration or type use.
