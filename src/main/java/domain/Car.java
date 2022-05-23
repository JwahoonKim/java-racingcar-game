package domain;

public class Car {
    final private String name;
    private int distance = 0;

    public Car(String name) {
        this.name = name;
    }

    public void race(int num) {
        if (num >= 4) go();
    }

    public void race() {
        race(RandomUtil.getRandomNumber());
    }

    public void go() {
        this.distance += 1;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return this.distance;
    }
}
