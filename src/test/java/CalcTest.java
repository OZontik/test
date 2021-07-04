import org.junit.jupiter.api.Assertions;

public class CalcTest {
    @org.junit.jupiter.api.Test
    public void plusTest() {
        Calc calc = Calc.instance.get();

        int a = calc.plus.apply(1, 3);

        Assertions.assertEquals(a, 4);

    }
    public void minusTest() {

        Calc calc = Calc.instance.get();

        int b = calc.minus.apply(4, 2);

        Assertions.assertEquals(b, 2);

    }
    public void multiplyTest() {

        Calc calc = Calc.instance.get();

        int c = calc.multiply.apply(5, 2);

        Assertions.assertEquals(c, 10);
    }

    public void devideTest() {

        Calc calc = Calc.instance.get();

        int c = calc.devide.apply(6, 2);

        Assertions.assertEquals(c, 3);
    }
}
