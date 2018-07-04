import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class OurThingOurTest {
	
	@Test
	public void valueOfOurThing() {
		
		OurThing num = new OurThing();
		
		assertEquals(5, num.ourThing());
		
	}
	
}