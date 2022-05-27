package domain;

import java.util.Objects;

public class Position implements Comparable<Position> {

    private int position;

    public Position(int position) {
        validPosition(position);
        this.position = position;
    }

    private void validPosition(int position) {
        if (position < 0)
            throw new IllegalArgumentException("자동차의 위치는 음수일 수 없습니다.");
    }

    public void goForward() {
        this.position++;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    @Override
    public int compareTo(Position o) {
        return position > o.getPosition() ? 1 : -1;
    }
}
