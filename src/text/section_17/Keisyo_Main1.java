package text.section_17;

public class Keisyo_Main1 {

	public static void main(String[] args) {
		//Keisyo_Kato1クラスのオブジェクトを作る
		Keisyo_Child1 child = new Keisyo_Child1();
		      
        //体重を設定する
        child.weight = 70.0;
      
        //身長を設定する(BMIでは160cmの身長は1.6と表します。)
        child.height = 1.6;
        
        // 計算
        double bmi = child.calcBmi(child.weight, child.height);
        System.out.println("BMIは" + bmi);
	}

}
