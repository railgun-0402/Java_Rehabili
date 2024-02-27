package text.section_12;



public class Array_番号 {
	
	public class Item {
		String name;
		int price = 100;
	}

	public static void main(String[] args) {
		// 配列の要素を指定しない場合、ハッシュコードが表示される
		int[] array = new int[0];
		System.out.println(array);

		// []は型でも変数の後でも良い(先に記載するのが推奨)
		int[] a;
		int b[];
		int[][] c;
		int d[][];
		int[] e[];
		int[][] f[];
		
		// 宣言時に要素数は指定できず、コンパイルエラーになる
//		int[3] a;
//		int b[2];
//		int[2] c[];
//		int d[3][];
		
		// 配列インスタンスを作成(Itemクラスではない)
		Item[] item = new Item[3];
		// null表示
		System.out.println(item[0]);
		
		int total = 0;
		for (int i = 0; i < item.length; i++) {
			// Nullポになる
//			total += item[i].price;
		}
		System.out.println(total);

		int[] scoreArray = { 70, 85, 80, 95, 90 };

		// 拡張forを使用して、配列表示
		for (int score: scoreArray) {
			System.out.println(score);	
		}

	}

}
