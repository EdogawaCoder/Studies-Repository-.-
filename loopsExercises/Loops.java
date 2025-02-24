import java.util.Scanner;

public class ExerciciosLoops {

    public static void main(String[] args) {
        calculatorLoop();
    }

    public static void calculatorLoop() {

        // ユーザーに100までの合計を求める初期値を選択させる
        // ユーザー に ひゃく まで の ごうけい を もとめる しょきち を せんたく させる
        // Prompt the user to choose an initial value to sum up to 100

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an initial value to sum up to 100: ");
        // ひゃく まで ごうけい する ため の しょきち を えらんで ください:

        int numberChosen = scanner.nextInt();
        int sum = 0;

        // ループを使って選択した値から100までの合計を計算
        // ループ を つかって せんたく した あたい から ひゃく まで の ごうけい を けいさん
        // Loop to calculate the sum from the chosen value to 100

        for (int i = numberChosen; i <= 100; i++) {
            sum += i;
        }

        // 結果を出力
        // けっか を しゅつりょく
        // Output the result

        System.out.println("The sum result from " + numberChosen + " to 100 is: " + sum);
        // から ひゃく まで の ごうけい は:

        scanner.close();
    }
}
