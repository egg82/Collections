package ninja.egg82.tuples.floats;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class FloatCharPair {
    private float first;
    private char second;
    private int hc;

    public FloatCharPair(float first, char second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(5483, 45557).append(first).append(second).toHashCode();
    }

    public float getFirst() { return first; }

    public char getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        FloatCharPair o = (FloatCharPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
