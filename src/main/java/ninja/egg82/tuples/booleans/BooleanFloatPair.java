package ninja.egg82.tuples.booleans;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class BooleanFloatPair {
    private boolean first;
    private float second;
    private int hc;

    public BooleanFloatPair(boolean first, float second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(4231, 14347).append(first).append(second).toHashCode();
    }

    public boolean getFirst() { return first; }

    public float getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        BooleanFloatPair o = (BooleanFloatPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
