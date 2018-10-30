package ninja.egg82.tuples.bytes;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ByteBooleanPair {
    private byte first;
    private boolean second;
    private int hc;

    public ByteBooleanPair(byte first, boolean second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(6173, 29077).append(first).append(second).toHashCode();
    }

    public byte getFirst() { return first; }

    public boolean getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ByteBooleanPair o = (ByteBooleanPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
