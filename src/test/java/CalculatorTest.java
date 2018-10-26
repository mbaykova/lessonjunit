import org.junit.jupiter.api.*;
import ru.aplana.demo.Addition;
import ru.aplana.demo.Division;
import ru.aplana.demo.Multiplication;
import ru.aplana.demo.Subtraction;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Maria on 20.10.2018.
 */
public class CalculatorTest {

	@BeforeAll
	static void initAll() {
		System.out.println("BeforeAll");
	}

	@BeforeEach
	void initEah() {
		System.out.println("BeforeEach");
	}

	@Test
	void testAddition() {
		Addition addition = new Addition(2, 2);
		assertEquals(4, addition.calculateResult());
	}


	@Test
	void testSubtraction() {
		Subtraction subtraction = new Subtraction(2, 2);
		assertEquals(0, subtraction.calculateResult(), "Ошибка! Получено значение " + subtraction.calculateResult());
	}


	@Test
	void testDivision() {
		Division division = new Division(1, 2);
		assertEquals(0.5, division.calculateResult());
	}

	@Test
	void testDelta() {
		Division division = new Division(1, 3);
		assertEquals(0.3, division.calculateResult(), 0.3);
	}


	@Test
	void testMultiplication() {
		Multiplication multiplication = new Multiplication(3, 2);
		assertEquals(6, multiplication.calculateResult());
	}

	@AfterAll
	static void afterAll() {
		System.out.println("AfterAll");
	}

	@AfterEach
	void afterEach() {
		System.out.println("AfterEach");
	}
}
