package ninja.egg82.tuples.floats;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class FloatLongPair {
    private float first;
    private long second;
    private int hc;

    public FloatLongPair(float first, long second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(8059, 10891).append(first).append(second).toHashCode();
    }

    public float getFirst() { return first; }

    public long getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        FloatLongPair o = (FloatLongPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
