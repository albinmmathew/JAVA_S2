/*PROGRAM 23 RE-THROW AND FINALLY
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 16/12/2025
*/

class Division {
    void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in divide(): " + e);
            throw e; // re-throwing the exception
        } finally {
            System.out.println("Divide is Finished");
        }
    }
}

class PROGRAM23 {
    public static void main(String[] args) {
        Division obj = new Division();
        try {
            obj.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main(): " + e);
        }
    }
}
