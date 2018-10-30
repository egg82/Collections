package ninja.egg82.tuples.shorts;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ShortLongPair {
    private short first;
    private long second;
    private int hc;

    public ShortLongPair(short first, long second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(22193, 62761).append(first).append(second).toHashCode();
    }

    public short getFirst() { return first; }

    public long getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ShortLongPair o = (ShortLongPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
