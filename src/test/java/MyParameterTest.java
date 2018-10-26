import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import ru.aplana.demo.Addition;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Maria on 26.10.2018.
 */
public class MyParameterTest {


	@ParameterizedTest
	@ValueSource(strings = { "Hello", "HelloWorld" })
	@Ignore
	void testWithStringParameter(String argument) {
		assertTrue(argument.contains("Hello"));
	}


	@ParameterizedTest
	@CsvSource({ "0, 0, 0", "1, 1, 2", "2, 2, 4" })
	void testWithCsvSource(double number1, double number2, double result) {
		assertEquals(result, new Addition(number1, number2).calculateResult());
	}
}
