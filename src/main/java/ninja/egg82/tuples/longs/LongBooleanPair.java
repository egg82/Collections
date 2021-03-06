package ninja.egg82.tuples.longs;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class LongBooleanPair {
    private long first;
    private boolean second;
    private int hc;

    public LongBooleanPair(long first, boolean second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(4519, 49537).append(first).append(second).toHashCode();
    }

    public long getFirst() { return first; }

    public boolean getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        LongBooleanPair o = (LongBooleanPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
