package ninja.egg82.tuples.objects;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ObjectCharPair<T> {
    private T first;
    private char second;

    public ObjectCharPair(T first, char second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() { return first; }

    public char getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ObjectCharPair o = (ObjectCharPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return new HashCodeBuilder(11897, 18701).append(first).append(second).toHashCode(); }
}
