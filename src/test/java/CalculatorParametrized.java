import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by Maria on 20.10.2018.
 */

@RunWith(Parameterized.class)
public class CalculatorParametrized {

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{ 0, 0, 0 }, { 1, 1 , 2}, { 2, 1, 3 }, { 3, 2 ,5}, { 4, 3, 7 }, { 5, 5, 10 }, { 6, 8, 14 }
		});
	}

	@Parameterized.Parameter // first data value (0) is default
	public /* NOT private */ float number1;

	@Parameterized.Parameter(1)
	public /* NOT private */ float number2;

	@Parameterized.Parameter(2)
	public /* NOT private */ float result;

	@Test
	public void test() {
		assertEquals(result, number1 + number2, 0);
	}


}
