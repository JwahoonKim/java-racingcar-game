package carracing;

import carracing.domain.car.Car;
import carracing.domain.car.CarRacingGame;
import carracing.domain.car.CarRacingOption;
import carracing.view.CarRacingView;
import carracing.view.ScannerView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        String ASK_CAR_NUMBER = "자동차 대수는 몇 대 인가요?";

        String ASK_CAR_NAMES = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)";
        String ASK_ATTEMPT_NUMBER = "시도할 회수는 몇 회 인가요?";

        ScannerView scannerView = new ScannerView();
        CarRacingView carracingView = new CarRacingView();
        NumberInputScanner numberInputScanner = new NumberInputScanner();
        StringInputScanner stringInputScanner = new StringInputScanner();

        scannerView.textView(ASK_CAR_NAMES);

        String[] carNames = stringInputScanner.getNames();
        int carNumber = carNames.length;

        scannerView.textView(ASK_ATTEMPT_NUMBER);
        int gameCount = numberInputScanner.getNumber();

        CarRacingGame carRacingGame = new CarRacingGame(new CarRacingOption(carNames, carNumber, gameCount));

        for(int i = 0 ; i < gameCount ; i++) {
            carRacingGame.gameStart();
            List<Car> resultList = carRacingGame.gameResult();
            carracingView.view(resultList);
        }

        carracingView.resultView(carRacingGame.gameFinish());
    }
}