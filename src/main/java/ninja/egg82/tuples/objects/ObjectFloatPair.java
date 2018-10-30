package ninja.egg82.tuples.objects;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ObjectFloatPair<T> {
    private T first;
    private float second;

    public ObjectFloatPair(T first, float second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() { return first; }

    public float getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ObjectFloatPair o = (ObjectFloatPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return new HashCodeBuilder(23581, 52517).append(first).append(second).toHashCode(); }
}
