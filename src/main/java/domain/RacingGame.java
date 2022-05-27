package domain;

import view.InputView;
import view.ResultView;

public class RacingGame {
    private Cars cars;
    private int count;

    public void play() throws Exception {
        init();

        ResultView.resultMessage();

        while(count > 0) {
            Thread.sleep(500);
            count--;
            cars.race();
            ResultView.printStatus(cars.getCars());
        }

        ResultView.printResult(cars);
    }

    private void init() {
        setStadium();
        setCount();
    }

    private void setStadium() {
        InputView.startMessage();
        String players = InputView.inputPlayers();
        cars = new Cars(players);
    }

    private void setCount() {
        InputView.countMessage();
        count = InputView.inputCount();
    }
}
