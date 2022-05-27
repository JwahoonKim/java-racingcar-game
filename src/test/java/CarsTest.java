import domain.Car;
import domain.Cars;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    void Cars_생성_테스트() {
        Cars cars = new  Cars ("pobi,crong,honux");
        assertThat(cars.getCars().size()).isEqualTo(3);
    }


    @Test
    void 우승자_테스트() throws Exception {
        // given
        Car car1 = new Car("pl1", 3);
        Car car2 = new Car("pl2", 2);
        Car car3 = new Car("pl3", 4);
        Cars cars = new Cars(Arrays.asList(car1, car2, car3));

        //then
        assertThat(cars.getWinners()).containsExactly(car3);

    }
}
