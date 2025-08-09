public class Nullpointerexception {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length();
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
        finally {
            System.out.println("Finally block executed.");
        }
    }
}