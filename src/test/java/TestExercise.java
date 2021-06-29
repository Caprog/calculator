import org.junit.Assert;
import org.junit.Test;

public class TestExercise {

    private Calculator calculator = new Calculator();

    @Test
    public void should_return_one_for_sum_one_plus_zero() {
        float sum = calculator.sum(1, 0);
        Assert.assertEquals(1f, sum, 0);
    }

    @Test
    public void should_return_one_if_subtract_one_to_two() {
        float subt = calculator.subtract(2, 1);
        Assert.assertEquals(1f, subt, 0);
    }

    @Test
    public void should_return_one_for_division_two_above_two() {
        float division = calculator.division(2, 2);
        Assert.assertEquals(1f, division, 0);
    }

    @Test
    public void should_return_one_for_multiply_one_with_one() {
        float multiply = calculator.multiply(1, 1);
        Assert.assertEquals(1f, multiply, 0);
    }
}
