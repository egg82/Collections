package ninja.egg82.tuples.longs;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class LongIntPair {
    private long first;
    private int second;
    private int hc;

    public LongIntPair(long first, int second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(33997, 38083).append(first).append(second).toHashCode();
    }

    public long getFirst() { return first; }

    public int getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        LongIntPair o = (LongIntPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
