package coding_bat.warmup1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MonkeyTroubleTest {

	@Test
	public void examples() {
		assertTrue(MonkeyTrouble.monkeyTrouble(true,true));
		assertTrue(MonkeyTrouble.monkeyTrouble(false, false));
		assertFalse(MonkeyTrouble.monkeyTrouble(true,  false));
	}

}
