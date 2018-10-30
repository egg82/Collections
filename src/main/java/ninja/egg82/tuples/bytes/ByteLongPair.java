package ninja.egg82.tuples.bytes;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ByteLongPair {
    private byte first;
    private long second;
    private int hc;

    public ByteLongPair(byte first, long second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(15077, 41113).append(first).append(second).toHashCode();
    }

    public byte getFirst() { return first; }

    public long getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ByteLongPair o = (ByteLongPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
