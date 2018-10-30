package ninja.egg82.tuples.floats;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class FloatFloatPair {
    private float first;
    private float second;
    private int hc;

    public FloatFloatPair(float first, float second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(25793, 37189).append(first).append(second).toHashCode();
    }

    public float getFirst() { return first; }

    public float getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        FloatFloatPair o = (FloatFloatPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
