package text.section_17;

public class Keisyo_Human_Parent {
	   //体重フィールド
	   double weight;
	   //身長フィールド
	   double height;
	   
	   // BMI計算メソッド
	   double calcBmi(double weight, double height) {
		   return this.weight / (this.height * this.height);
	   }

}
