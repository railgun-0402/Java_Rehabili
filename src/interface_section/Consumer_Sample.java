package interface_section;

import java.util.function.Consumer;

public class Consumer_Sample {
	/*
	 * Consumer：引数を渡し、戻り値は返ってこない
	 * Consumer<T> の抽象メソッド
	 */
	public static void main(String[] args) {
		Consumer<Integer> consumer = num ->  System.out.println("(consumer)引数として渡した値：" + num);
		Consumer<Integer> consumer2 = num2 ->  System.out.println("(consumer2)引数として渡した値：" + num2);
		Consumer<Integer> consumer3 = num3 ->  System.out.println("(consumer3)引数として渡した値：" + num3);
		
		// andThen: andThenでつながっている左辺から順に実行
		// 1→2→3
		consumer.andThen(consumer2).andThen(consumer3).accept(15);
		System.out.println("=========");
		
		// 2→1→3
		consumer2.andThen(consumer).andThen(consumer3).accept(15);
		System.out.println("=========");
		
		// 3→2→1
		consumer3.andThen(consumer2).andThen(consumer).accept(15);
	}
}
