package lesson_6;

public class Instance {

	public static void main(String[] args) {
		// 曖昧な呼び出し
		Instance instance = new Instance();
		//System.out.println(instance.calc(2, 3)); // どちらのcalcを呼び出すべきか判断不可
	}
	
	// オーバーロードしているメソッド
	private double calc(double a, int b) {
		return (a+b) / 2;
	}
	
	// オーバーロードしているメソッド
	private double calc(int a, double b) {
		return (a+b) / 2;
	}

}
