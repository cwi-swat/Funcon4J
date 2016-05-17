package funcons.values;

import java.lang.*;

public class Bool implements Value {

    private java.lang.Boolean value;

    public Bool(java.lang.Boolean b) {
        value = b;
    }

    public java.lang.Boolean boolValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Bool && ((Bool)other).value.equals(value);
    }

    @Override
    public java.lang.String toString() {
        return value.toString();
    }
}