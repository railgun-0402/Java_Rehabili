package text.section_04;

public class Data {

	public static void main(String[] args) {
		// intの範囲を超える場合は、エラーになる
		//System.out.println(2147483648);
		
		// long型にするとエラー消える(サフィックスを付与)
		System.out.println(2147483648L);
		
		int test = 11;
		System.out.println(test); // 初期化してない変数は使用不可
		
		// [範囲の狭いデータ型]→[広範囲なデータ型]の自動型変換
        long   valLong   = 123;    // int型の値をlong型に変換して代入
        float  valFloat  = 123;    // int型の値をfloat型に変換して代入
        double valDouble = 123.4F; // float型の値をdouble型に変換して代入
        
        System.out.println(valLong);
        System.out.println(valFloat);
        System.out.println(valDouble);
        
        // short型の値をbyte型にキャスト
        short valShort = 32767;
        byte  valByte  = (byte)valShort; // byte型に収まらず不正値となる
        System.out.println(valByte);

        // double型の値をint型にキャスト
        double valDouble2 = 123.456;
        int    valInt    = (int)valDouble2; // 小数部分はカットされる
        System.out.println(valInt);

	}

}
