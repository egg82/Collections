package ninja.egg82.tuples.bytes;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ByteCharPair {
    private byte first;
    private char second;
    private int hc;

    public ByteCharPair(byte first, char second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(18859, 57529).append(first).append(second).toHashCode();
    }

    public byte getFirst() { return first; }

    public char getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ByteCharPair o = (ByteCharPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
