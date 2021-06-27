import org.junit.jupiter.api.Assertions;

public class Test {
    @org.junit.jupiter.api.Test
    public void test() {
        // given:
        Calc calc = Calc.instance.get();

        // when:
        int a = calc.plus.apply(1, 3);
        int b = calc.minus.apply(4, 2);
        int c = calc.multiply.apply(a, b);

        // then:
        Assertions.assertEquals(a, 4);
        Assertions.assertEquals(b, 2);
        Assertions.assertEquals(c, 8);
    }
}
