package ninja.egg82.tuples.longs;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class LongFloatPair {
    private long first;
    private float second;
    private int hc;

    public LongFloatPair(long first, float second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(54787, 19949).append(first).append(second).toHashCode();
    }

    public long getFirst() { return first; }

    public float getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        LongFloatPair o = (LongFloatPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
