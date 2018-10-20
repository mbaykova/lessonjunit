import org.junit.Assert;
import org.junit.Test;
import ru.aplana.demo.Addition;
import ru.aplana.demo.Division;
import ru.aplana.demo.Multiplication;
import ru.aplana.demo.Subtraction;

/**
 * Created by Maria on 20.10.2018.
 */
public class CalculatorTest {


	@Test
	public void testAddition(){
		Addition addition = new Addition(2,2);
		Assert.assertEquals(4, addition.calculateResult(), 0);
	}


	@Test
	public void testSubtraction(){
		Subtraction subtraction = new Subtraction(2,2);
		Assert.assertEquals(0, subtraction.calculateResult(), 0);
	}


	@Test
	public void testDivision(){
		Division division = new Division(1,2);
		Assert.assertEquals(0.5, division.calculateResult(), 0);
	}

	@Test
	public void testDelta(){
		Division division = new Division(1,3);
		Assert.assertEquals(0.3, division.calculateResult(), 0.3);
	}


	@Test
	public void testMultiplication(){
		Multiplication multiplication = new Multiplication(3,2);
		Assert.assertEquals(6, multiplication.calculateResult(), 0);
	}
}
