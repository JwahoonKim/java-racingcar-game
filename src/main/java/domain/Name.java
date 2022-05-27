package domain;

public class Name {

    public static final int MAX_CAR_NAME_LENGTH = 5;

    final String name;

    public Name(String name) {
        validCarNameLength(name);
        this.name = name;
    }

    private void validCarNameLength(String name) {
        if(name.length() > MAX_CAR_NAME_LENGTH) throw new IllegalArgumentException("자동차 이름은 5자 이하여야합니다.");
    }

    @Override
    public String toString() {
        return name;
    }
}
