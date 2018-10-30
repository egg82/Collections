package ninja.egg82.tuples.bytes;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ByteFloatPair {
    private byte first;
    private float second;
    private int hc;

    public ByteFloatPair(byte first, float second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(11, 65063).append(first).append(second).toHashCode();
    }

    public byte getFirst() { return first; }

    public float getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ByteFloatPair o = (ByteFloatPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
