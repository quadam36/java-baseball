package baseball;

import java.util.ArrayList;
import java.util.Scanner;

public class UserIO {
    private static final String INPUT_NUMBER_MSG = "숫자를 입력해주세요 : ";
    private static final String INPUT_IS_RESTART_MSG = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final String OUTPUT_NOTHING_MSG = "낫싱";
    private static final String OUTPUT_BALL_MSG = "볼";
    private static final String OUTPUT_STRIKE_MSG = "스트라이크";
    private static final String OUTPUT_DELIMITER_MSG = " ";
    private final Scanner scanner;

    public UserIO(Scanner scanner) {
        this.scanner = scanner;
    }

    // 5.2.3 : Method names are written in lowerCamelCase
    public ArrayList<Integer> inputNumber() {
        ArrayList<Integer> number = new ArrayList<>();

        System.out.print(INPUT_NUMBER_MSG);
        String[] strings = this.scanner.next().split("");
        for (String s : strings) {
            int val = Integer.parseInt(s);
            number.add(val);
        }
        return number;
    }

    public Boolean inputIsRestart() {
        System.out.println(INPUT_IS_RESTART_MSG);
        Integer val = this.scanner.nextInt();

        return val.equals(1);
    }

    public void outputInfo(Integer ball, Integer strike) {
        StringBuilder msg = new StringBuilder();

        if (ball == 0 && strike == 0) {
            msg.append(OUTPUT_NOTHING_MSG);
        }
        if (ball > 0) {
            msg.append(ball).append(OUTPUT_BALL_MSG);
        }
        if (ball > 0 && strike > 0) {
            msg.append(OUTPUT_DELIMITER_MSG);
        }
        if (strike > 0) {
            msg.append(strike).append(OUTPUT_STRIKE_MSG);
        }

        System.out.println(msg);
    }
}
