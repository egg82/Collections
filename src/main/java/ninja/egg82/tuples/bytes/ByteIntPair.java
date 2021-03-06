package ninja.egg82.tuples.bytes;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ByteIntPair {
    private byte first;
    private int second;
    private int hc;

    public ByteIntPair(byte first, int second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(24623, 5113).append(first).append(second).toHashCode();
    }

    public byte getFirst() { return first; }

    public int getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ByteIntPair o = (ByteIntPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
