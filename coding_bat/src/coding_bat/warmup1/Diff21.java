package coding_bat.warmup1;

public class Diff21 {

	public static Object diff21(int n) {
		if (n <= 21) {
			return 21 - n;
		} else {
			return (n - 21) * 2;
		}
	}

}
