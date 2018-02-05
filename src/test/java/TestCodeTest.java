import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestCodeTest {

    private Random random;
    private TestCode testCode;

    @Before
    public void setUp() {
        random = mock(Random.class);
        testCode = new TestCode(random);
    }

    @Test
    public void get_test_value_returns_at_minimum_1() {
        given(random.nextInt(10)).willReturn(0);

        // when
        int value = testCode.getTestValue();

        // then
        assertThat(value).isEqualTo(1);
    }

    @Test
    public void get_test_value_returns_at_maximum_10() {
        given(random.nextInt(10)).willReturn(9);

        // when
        int value = testCode.getTestValue();

        // then
        assertThat(value).isEqualTo(10);
    }
}