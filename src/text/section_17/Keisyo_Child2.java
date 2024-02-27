package text.section_17;

public class Keisyo_Child2 extends Keisyo_Human2 {

	public static void main(String[] args) {
		Keisyo_Child2 human = new Keisyo_Child2();
		human.method1();
	}
	
	//抽象メソッドに具体的な処理を記述
	void method1() {
		System.out.println("ChildMethod");
	}

}
