package zelek.rafal.calculator;

public class DummyRandom implements IRandom{
    final int value;

    public DummyRandom(int value) {
        this.value = value;
    }

    @Override
    public int random() {
        return 0;
    }
}
