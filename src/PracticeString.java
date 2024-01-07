public class PracticeString {


    public void sayMessage()
    {
        System.out.println("Hello world!");

    }

    public static void main(String[] args) {
       // reverse string
String msg = "HELLO";
int length = msg.length();
char[] charMsgArray = msg.toCharArray();
for (int i = length-1; i>=0; i--)
{
    System.out.println(i + " " + (i>=0) + (length-1));
    //System.out.print(charMsgArray[i]);
}
for (int j = msg.length()-1; j>=0; j--)
{
    System.out.print(msg.charAt(j));
}
StringBuffer sb = new StringBuffer(msg);
        System.out.print(sb.reverse());
StringBuilder sbr = new StringBuilder(msg);
        System.out.print(sbr.reverse());
    }
}

@FunctionalInterface
interface FuncInterface1
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
