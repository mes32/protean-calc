import java.math.*;

import com.github.mes32.proteancalculator.*;
import org.junit.*;
import org.junit.Assert.*;

public class ArithmeticOperatorUnitTests {
    @Test
    public void testAdd1() {

        BigDecimal one = new BigDecimal("1");
        BigDecimal two = new BigDecimal("2");
        ArithmeticOperator add = ArithmeticOperator.ADD;
        BigDecimal output = add.evaluate(one, one);

        Assert.assertTrue(output.equals(two));
    }
}