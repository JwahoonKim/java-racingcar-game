package racingcar.domain;

public class Car {
    private Distance distance = new Distance();
    private final String name;

    public Car(String name) {
        this.name = name;
    }

    public Distance getDistance() {
        return distance;
    }

    public void move() {
        distance = distance.increase();
    }

    public String getName() {
        return name;
    }
}
