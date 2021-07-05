public class Calculator {

    public float sum(float a, float b) {
        return a + b;
    }

    public float subtract(float a, float b) {
        return a - b;
    }

    public float division(float a, float b) {
        return a / b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 1));
        System.out.println(calculator.subtract(1, 1));
        System.out.println(calculator.division(2, 2));
        System.out.println(calculator.multiply(1, 2));
    }
}
