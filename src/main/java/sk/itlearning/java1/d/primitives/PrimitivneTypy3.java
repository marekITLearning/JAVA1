package sk.itlearning.java1.d.primitives;

public class PrimitivneTypy3 {

	public static void main(String[] args) {

		// implicitne (automaticke) pretypovanie int -> byte
		byte b = 127;

		// implicitne pretypovanie byte -> int
		int i = b;
		System.out.println(i);

		// explicitne (manualne) pretypovanie (musime zvazit pretecenie)
		b = (byte) i;

		// implicitne pretypovanie double -> float nefunguje
		float f = 5.0f;

		// implicitne pretypovanie float -> double
		double d = f;

		// implicitne pretypovania pri operaciach
		System.out.println(10 / 3);
		System.out.println(i + d);

		// od java 7 mozme pouzit oddelovac tisicov
		System.out.println(9_876_543);
	}

}
