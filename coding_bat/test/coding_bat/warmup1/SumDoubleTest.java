package coding_bat.warmup1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumDoubleTest {

	@Test
	public void examples() {
		assertEquals(3, SumDouble.sumDouble(1, 2));
		assertEquals(5, SumDouble.sumDouble(3, 2));
		assertEquals(8, SumDouble.sumDouble(2, 2));
	}

}
