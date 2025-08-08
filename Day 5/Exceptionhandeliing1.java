public class Exceptionhandeliing1 {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = 100/0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred: " + e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println("Null pointer error occurred: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds error occurred: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("General exception occurred: " + e.getMessage());
        }
        finally{
            System.out.println("This will execute no matter what");
        }
        System.out.print(a);
    }
}
