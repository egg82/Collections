package ninja.egg82.tuples.floats;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class FloatBooleanPair {
    private float first;
    private boolean second;
    private int hc;

    public FloatBooleanPair(float first, boolean second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(14771, 547).append(first).append(second).toHashCode();
    }

    public float getFirst() { return first; }

    public boolean getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        FloatBooleanPair o = (FloatBooleanPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
