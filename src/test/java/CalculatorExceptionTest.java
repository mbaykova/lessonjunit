import org.junit.Ignore;
import org.junit.Test;
import ru.aplana.demo.Division;
import ru.aplana.demo.DivisionException;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * Created by Maria on 20.10.2018.
 */
public class CalculatorExceptionTest {


	@Test(expected = DivisionException.class)
	public void divisionTest() {
		new Division(1, 0).calculateResult();
	}


	@Test(expected = ArrayIndexOutOfBoundsException.class)
	@Ignore
	public void divisionTestError() {
		new Division(1, 0).calculateResult();
	}

	@Test(expected = Exception.class)
	public void divisionTestException() {
		new Division(1, 0).calculateResult();
	}


	@Test
	public void testExceptionMessage() {
		try {
			new Division(1, 0).calculateResult();
			fail("Expected an DivisionException to be thrown");
		} catch (DivisionException e) {
			assertThat(e.getMessage(), is("На 0 делить нельзя!"));
		}
	}
}
