import domain.Stadium;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StadiumTest {

    @Test
    void 스타디움_생성_테스트() {
        Stadium st = new Stadium("pobi,crong,honux");
        assertThat(st.getCars().size()).isEqualTo(3);
    }

    @Test
    void 우승자_테스트() {
        // 단위 테스트가 안되네? setter를 넣어줘야하나?
    }
}
