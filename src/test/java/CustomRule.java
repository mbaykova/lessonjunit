import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * Created by Maria on 20.10.2018.
 */
public class CustomRule implements TestRule {

	public Statement apply(final Statement base, Description description) {
		return new Statement() {
			@Override
			public void evaluate() throws Throwable {
				System.out.println("before ");
				base.evaluate();
				System.out.println("after");
			}
		};
	}
}
