package view;

import domain.Car;
import domain.Stadium;

import java.util.List;

public class ResultView {
    public static void printStatus(List<Car> cars) {
        cars.forEach(car -> System.out.println(car.getName() + " : " + "-".repeat(car.getDistance())));
        System.out.println();
    }

    public static void resultMessage() {
        System.out.println("실행 결과");
    }


    public static void printResult(Stadium st) throws Exception {
        List<Car> winner = st.getWinner();
        winner.forEach(car -> System.out.print(car.getName() + ", "));
        System.out.println("가 최종 우승했습니다.");
    }
}
