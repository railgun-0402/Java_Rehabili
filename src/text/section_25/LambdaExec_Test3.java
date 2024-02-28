package text.section_25;

public class LambdaExec_Test3 {

	public static void main(String[] args) {
		// ラムダ式で、抽象メソッドを実装する
		Lambda_Test3 lambda = (str) -> System.out.println(str);
		lambda.test3("ラムダ式を使用して、実装を行いました");
	}
}
