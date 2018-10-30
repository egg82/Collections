package ninja.egg82.tuples.longs;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class LongBytePair {
    private long first;
    private byte second;
    private int hc;

    public LongBytePair(long first, byte second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(57203, 31259).append(first).append(second).toHashCode();
    }

    public long getFirst() { return first; }

    public byte getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        LongBytePair o = (LongBytePair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
