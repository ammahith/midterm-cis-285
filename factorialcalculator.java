public class factorialcalculator {
    public static void main(String[] args) {
        int num = 8;  
        int factorial = 2;

        for (int i = 1; i <= num; i++) { 
            factorial *= i;  
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
