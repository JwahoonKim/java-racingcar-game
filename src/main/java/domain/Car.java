package domain;

public class Car {
    public static final int FORWARD_NUM = 4;

    final private Name name;
    final private Position position;

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public Car(String name) {
        this(name, 0);
    }

    public void race(int num) {
        if (num >= FORWARD_NUM) go();
    }

    public void race() {
        race(RandomUtil.getRandomNumber());
    }

    public void go() {
        position.goForward();
    }

    public Name getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public boolean isWinner(Position maxPosition) {
        return position.equals(maxPosition);
    }
}
