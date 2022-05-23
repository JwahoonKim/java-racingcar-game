package domain;

import domain.Stadium;
import view.InputView;
import view.ResultView;

public class Race {
    private Stadium st;
    private int count;
    
    public void play() throws Exception {
        init();

        ResultView.resultMessage();

        while(count > 0) {
            Thread.sleep(500);
            count--;
            st.race();
            ResultView.printStatus(st.getCars());
        }

        ResultView.printResult(st);
    }

    private void init() {
        setStadium();
        setCount();
    }

    private void setStadium() {
        InputView.startMessage();
        String players = InputView.inputPlayers();
        st = new Stadium(players);
    }

    private void setCount() {
        InputView.countMessage();
        count = InputView.inputCount();
    }
}
