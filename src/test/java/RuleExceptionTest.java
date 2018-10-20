import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import ru.aplana.demo.Division;
import ru.aplana.demo.DivisionException;

/**
 * Created by Maria on 20.10.2018.
 */
public class RuleExceptionTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void shouldTestExceptionMessage()  {
		Division division = new Division(1, 0);
		thrown.expect(DivisionException.class);
		thrown.expectMessage("На 0 делить нельзя!");
		division.calculateResult();
	}
}
