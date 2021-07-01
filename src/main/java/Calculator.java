public class Calculator {

    public float sum(float a, float b) {
        return 1;
    }

    public float subtract(float a, float b) {
        return 1;
    }

    public float division(float a, float b) {
        return 1;
    }

    public float multiply(float a, float b) {
        return 1;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 0));
        System.out.println(calculator.subtract(2, 1));
        System.out.println(calculator.division(2, 2));
        System.out.println(calculator.multiply(1, 1));
    }
}
