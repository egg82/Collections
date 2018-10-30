package ninja.egg82.tuples.shorts;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ShortObjectPair<T> {
    private short first;
    private T second;

    public ShortObjectPair(short first, T second) {
        this.first = first;
        this.second = second;
    }

    public short getFirst() { return first; }

    public T getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ShortObjectPair o = (ShortObjectPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return new HashCodeBuilder(9587, 55147).append(first).append(second).toHashCode(); }
}
