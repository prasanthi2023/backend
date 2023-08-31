package exeception;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Exception => " + e.getMessage());
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}

