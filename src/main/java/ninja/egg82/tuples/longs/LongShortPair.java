package ninja.egg82.tuples.longs;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class LongShortPair {
    private long first;
    private short second;
    private int hc;

    public LongShortPair(long first, short second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(45533, 27031).append(first).append(second).toHashCode();
    }

    public long getFirst() { return first; }

    public short getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        LongShortPair o = (LongShortPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
