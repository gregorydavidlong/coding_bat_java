package coding_bat.warmup1;

public class SleepIn {

	public static boolean sleepIn(boolean weekday, boolean vacation) {
		return (weekday == vacation) || (!weekday && vacation);
	}

	
}
