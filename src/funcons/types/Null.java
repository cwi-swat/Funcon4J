package funcons.types;

public class Null implements Unit {
    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Null;
    }

}
