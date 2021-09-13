public class JavaException()
{

    public static void main(String[] args) {
        try {
            int sum = 34 + 54;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
