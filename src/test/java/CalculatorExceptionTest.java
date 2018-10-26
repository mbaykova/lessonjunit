import org.junit.jupiter.api.Test;
import ru.aplana.demo.Division;
import ru.aplana.demo.DivisionException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


/**
 * Created by Maria on 20.10.2018.
 */
public class CalculatorExceptionTest {


	@Test
	 void divisionTest() {
		Throwable exception = assertThrows(DivisionException.class, () -> {
			new Division(1, 0).calculateResult();
		});
		assertEquals("На 0 делить нельзя!", exception.getMessage());

	}

}
