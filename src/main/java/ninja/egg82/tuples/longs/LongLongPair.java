package ninja.egg82.tuples.longs;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class LongLongPair {
    private long first;
    private long second;
    private int hc;

    public LongLongPair(long first, long second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(37049, 12853).append(first).append(second).toHashCode();
    }

    public long getFirst() { return first; }

    public long getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        LongLongPair o = (LongLongPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
