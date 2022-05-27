package domain;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(String players) {
        cars = getCarList(getPlayerList(players));
    }

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    private String[] getPlayerList(String players) {
        return players.split(",");
    }

    private List<Car> getCarList(String[] playerList) {
        return Arrays.stream(playerList)
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public void race() {
        cars.forEach(Car::race);
    }


    public List<Car> getWinners() throws Exception {
        Position maxPosition = getMaxPosition();
        return cars.stream()
                .filter(car -> car.isWinner(maxPosition))
                .collect(Collectors.toList());
    }

    private Position getMaxPosition() throws Exception {
        return cars.stream()
                .max(Comparator.comparing(Car::getPosition))
                .orElseThrow(Exception::new)
                .getPosition();
    }
}
