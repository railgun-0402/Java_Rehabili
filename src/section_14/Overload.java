package section_14;

public class Overload {
	
	// int型
	public static void test(int i) {
		System.out.println("(1)int型：" + i );
	}
	
	// float型
	public static void test(float f) {
		System.out.println("(2)float型：" + f );
	}
	
	// int型,float
	public static void test(int i, float f) {
		System.out.println("(3)int型：" + i + "／float型：" + f );
	}

	// 順番を反対
	public static void test(float f, int i) {
		System.out.println("(4)float型：" + f + "／int型：" + i );
	}
	
	// 引数名だけ変えてもオーバロードにはならない！
	//	(型 Overload にメソッド test(int) が重複しています)
	//	public static void test(int g) {
	//		System.out.println("(1)int型：" + g );
	//	}

	public static void main(String[] args) {
		/*
		 * オーバロード：
		 * 引数のデータ型が異なる
		 * 引数の個数が異なる
		 * 引数の順番が異なる
		 */
		test(123);        // test(1)を呼び出す
		test(1.23F);      // test(2)を呼び出す
		test(123, 1.23F); // test(3)を呼び出す
		test(1.23F, 123); // test(4)を呼び出す
	}
}
