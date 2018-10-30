package ninja.egg82.tuples.longs;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class LongCharPair {
    private long first;
    private char second;
    private int hc;

    public LongCharPair(long first, char second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(42677, 37591).append(first).append(second).toHashCode();
    }

    public long getFirst() { return first; }

    public char getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        LongCharPair o = (LongCharPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
