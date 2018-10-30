package ninja.egg82.tuples.bytes;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ByteObjectPair<T> {
    private byte first;
    private T second;

    public ByteObjectPair(byte first, T second) {
        this.first = first;
        this.second = second;
    }

    public byte getFirst() { return first; }

    public T getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ByteObjectPair o = (ByteObjectPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return new HashCodeBuilder(42409, 25189).append(first).append(second).toHashCode(); }
}
