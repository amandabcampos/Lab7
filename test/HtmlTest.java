import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class HtmlTest {

	@Test
	public void testContainsAngleBraces() {

		String html = "<p></p>";

		Assertions.assertTrue(Lab7Regex.validateHTML(html));

	}

	@Test
	public void testMinLength() {

		String html = "<a></a>";

		Assertions.assertTrue(Lab7Regex.validateHTML(html));

	}

	@Test
	public void testRepeatsLetter() {

		String html = "<a></b>";

		Assertions.assertFalse(Lab7Regex.validateHTML(html));

	}

	@Test
	public void testStartsNumber() {

		String html = "<1a></1a>";

		Assertions.assertFalse(Lab7Regex.validateHTML(html));

	}
	
}