package domain;

import domain.Car;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stadium {

    private final List<Car> cars;
    public Stadium(String players) {
        cars = getCarList(getPlayerList(players));
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

    public List<Car> getWinner() throws Exception {
        int maxDist = getMaxDistance();
        return cars.stream()
                .filter(car -> car.getDistance() == maxDist)
                .collect(Collectors.toList());
    }

    private int getMaxDistance() throws Exception {
        return cars.stream()
                .max(Comparator.comparing(Car::getDistance))
                .orElseThrow(Exception::new)
                .getDistance();
    }
}
