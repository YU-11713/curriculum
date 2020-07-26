/**
 * Task1-3 : 課題内容
 *
 * 本課題では、演算子の使い方を学んでいきましょう。
 * 問①から問⑦まであります。
 * 指定された数値、式、変数名を守って記述してください。
 *
 * 問③,⑤については、コメントを入れてください。
 * 問⑦については、変数名を使って出力してください。
 *
 */
public class Task1_3 {
    public static void main(String[] args) {
        // ① 5 と 10 を加算した値を代入する、変数 plus を作成しなさい。
        int plus = 5 + 6;
        // ② 20 から 7 を減算した値を代入する、変数 minus を作成しなさい。
        int minus = 20 - 7;
        // ③下記の処理について、何をしているのかコメントを記入してください。
        // [ここへ記述] multiply変数にintを型宣言して、１０＊２の値の結果を代入したもの。
        int multiply = 10 * 2;
        // ④ 20 を 6 で割った余りを代入する、変数 remi を作成しなさい。
        int remi = 20 % 6;
        // ⑤下記の処理について、何をしているのかコメントを記入してください
        // [ここへ記述]townとlineに文字列を型宣言し、有楽町と線を代入した。
        String town = "有楽町";
        String line = "線";
        // ⑥ ⑤で作成した変数を連結させた値を代入する変数 train を作成しなさい。
        String train = town + line;
        // ⑦ 変数plus, minus, multiply, remi, train をそれぞれ出力しなさい。
        System.out.print(plus + "\n" + minus +"\n"+ multiply + "\n" + remi + "\n" + train);
    }
}