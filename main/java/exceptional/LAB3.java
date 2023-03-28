package exceptional;

public class LAB3 {
    public static void main(String[] args) {
        int[] list = new int[5];

        try {
            System.out.println("Statement 1");
            System.out.println(list[5]);
            System.out.println("Statement 3");
        }
        catch (ArithmeticException e) {

        }
        finally{
            System.out.println("Statement 4");
        }
        System.out.println("Statement 5");

    }
}
