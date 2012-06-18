package coding_bat.warmup1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SleepInTest {

	@Test
	public void examples() {
		assertTrue(SleepIn.sleepIn(false,false));
		assertFalse(SleepIn.sleepIn(true,false));
		assertTrue(SleepIn.sleepIn(false,true));
	}
	
}
