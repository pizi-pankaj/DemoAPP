public class Main {


    public void sayMessage()
    {
        System.out.println("Hello world!");

    }

    public static void main(String[] args) {
        // by default implements abstractFun()
        FuncInterface fobj =  x->System.out.println(2*x);

        // This calls above lambda expression and prints 10.
        fobj.abstractFun(5);


    }
}

@FunctionalInterface
interface FuncInterface
{
    // An abstract function
    void abstractFun(int x);

    default void message()
    {
        System.out.println("MEe");
    }
    default void message1()
    {
        System.out.println("MEe1");
    }
    default void message2()
    {
        System.out.println("MEe2");
    }
    static void message42()
    {
        System.out.println("MEe2");
    }
    static void message421()
    {
        System.out.println("MEe2");
    }
    // A non-abstract (or default) function
    default void normalFun()
    {
        System.out.println("Hello");
    }
}
