public class Calculator {

    public float sum(float a, float b) {
        float sum = a + b;
        return sum;
    }

    public float subtract(float a, float b) {
        float subtract = a - b;
        return subtract;
    }

    public float division(float a, float b) {
        float division = a / b;
        return division;
    }

    public float multiply(float a, float b) {
        float multiply = a * b;
        return multiply;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 1));
        System.out.println(calculator.subtract(1, 1));
        System.out.println(calculator.division(2, 2));
        System.out.println(calculator.multiply(1, 2));
    }
}
