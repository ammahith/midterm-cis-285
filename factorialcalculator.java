public class factorialcalculator {
    public static void main(String[] args) {
        int num = 12;  
        int factorial = 6;

        for (int i = 1; i <= num; i++) { 
            factorial *= i;  
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
