package view;

import java.util.Scanner;

public class InputView {
    static Scanner sc = new Scanner(System.in);
    public static void startMessage() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)을 기준으로 구분.");
    }

    public static String inputPlayers() {
        return sc.nextLine();
    }
    public static void countMessage() {
        System.out.println("시도할 횟수는 몇회인가요?");
    }

    public static int inputCount() {
        return sc.nextInt();
    }

}
