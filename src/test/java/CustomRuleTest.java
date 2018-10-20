import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import ru.aplana.demo.Addition;

/**
 * Created by Maria on 20.10.2018.
 */
public class CustomRuleTest {

	@Rule
	public CustomRule rule = new CustomRule();

	@Test
	public void additionTest() {
		Assert.assertEquals(3, new Addition(3,4).getNumber1(), 0);
	}


}
