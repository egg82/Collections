package ninja.egg82.tuples.bytes;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ByteBytePair {
    private byte first;
    private byte second;
    private int hc;

    public ByteBytePair(byte first, byte second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(55079, 36229).append(first).append(second).toHashCode();
    }

    public byte getFirst() { return first; }

    public byte getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ByteBytePair o = (ByteBytePair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
