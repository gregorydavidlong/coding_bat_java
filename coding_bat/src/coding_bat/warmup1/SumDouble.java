package coding_bat.warmup1;

public class SumDouble {

	public static Object sumDouble(int a, int b) {
		int result;
		if (a != b) {
			result = a + b;
		} else {
			result = 2 * (a + b);
		}
		return result;
	}

}
