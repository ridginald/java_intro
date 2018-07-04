import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JavaBuzzTest {
  @Test
	public void divisibleBy15Example1() {
    JavaBuzz sut = new JavaBuzz();
		assertEquals("FizzBuzz", sut.evaluate(30));
	}

  @Test
	public void divisibleBy15Example2() {
    JavaBuzz sut = new JavaBuzz();
		assertEquals("FizzBuzz", sut.evaluate(75));
	}

  @Test
  public void divisibleBy3Example1() {
    JavaBuzz sut = new JavaBuzz();
    assertEquals("Fizz", sut.evaluate(6));
  }

  @Test
  public void divisibleBy3Example2() {
    JavaBuzz sut = new JavaBuzz();
    assertEquals("Fizz", sut.evaluate(12));
  }

  @Test
  public void divisibleBy5Example1() {
    JavaBuzz sut = new JavaBuzz();
    assertEquals("Buzz", sut.evaluate(10));
  }

  @Test
  public void divisibleBy5Example2() {
    JavaBuzz sut = new JavaBuzz();
    assertEquals("Buzz", sut.evaluate(25));
  }

	@Test
	public void nonDivisibleNumberExample1() {
    JavaBuzz sut = new JavaBuzz();
		assertEquals("2", sut.evaluate(2));
	}

  @Test
  public void nonDivisibleNumberExample2() {
    JavaBuzz sut = new JavaBuzz();
		assertEquals("14", sut.evaluate(14));
	}
}
