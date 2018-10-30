package ninja.egg82.tuples.floats;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class FloatDoublePair {
    private float first;
    private double second;
    private int hc;

    public FloatDoublePair(float first, double second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(29333, 14251).append(first).append(second).toHashCode();
    }

    public float getFirst() { return first; }

    public double getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        FloatDoublePair o = (FloatDoublePair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
