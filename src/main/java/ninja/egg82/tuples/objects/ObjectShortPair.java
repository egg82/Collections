package ninja.egg82.tuples.objects;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ObjectShortPair<T> {
    private T first;
    private short second;

    public ObjectShortPair(T first, short second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() { return first; }

    public short getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ObjectShortPair o = (ObjectShortPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return new HashCodeBuilder(40627, 29663).append(first).append(second).toHashCode(); }
}
