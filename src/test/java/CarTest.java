import domain.Car;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {
    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("jahni");
    }

    @Test
    void 숫자가_4보다_크면_앞으로_간다() {
        car.race(4);
        Assertions.assertThat(car.getDistance()).isEqualTo(1);
    }

    @Test
    void 숫자가_4보다_작으면_안간다() {
        car.race(1);
        Assertions.assertThat(car.getDistance()).isEqualTo(0);
    }
}
