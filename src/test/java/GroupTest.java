import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Maria on 26.10.2018.
 */
public class GroupTest {


	@Test
	void testGroup(){
			// в группе все ассерты исполняются независимо,
			// успех - когда прошли успешно все ассерты
			assertAll("yandex",
				() -> assertThat("https://www.yandex.ru/", startsWith("https")),
				() -> assertThat("https://www.yandex.ru", endsWith(".ru/")),
				() -> assertThat("https://www.yandex.ru/", endsWith(".ru/")),
				() -> assertThat("https://www.yandex.ru/", endsWith(".ru"))
			);
	}


	@Test
	void testLinesMatch(){
		Assertions.assertLinesMatch(
			asList("можно сравнивать строки", "а можно по regex: \\d{2}\\.\\d{2}\\.\\d{4}"),
			asList("можно сравнивать строки", "а можно по regex: 12.09.2017")
		);
	}
}
