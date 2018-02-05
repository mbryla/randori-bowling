import java.util.Random;

public class TestCode {
    private final Random random;

    public TestCode(Random random) {
        this.random = random;
    }

    public TestCode() {
        this(new Random());
    }

    public int getTestValue() {
        return 1 + random.nextInt(10);
    }
}
