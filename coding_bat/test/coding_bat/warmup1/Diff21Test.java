package coding_bat.warmup1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Diff21Test {

	@Test
	public void examples() {
		assertEquals(2, Diff21.diff21(19));
		assertEquals(11, Diff21.diff21(10));
		assertEquals(0, Diff21.diff21(21));
	}
	
	@Test
	public void additionalTests() {
		assertEquals(2, Diff21.diff21(22));
	}

}
