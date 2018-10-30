package ninja.egg82.tuples.objects;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ObjectBooleanPair<T> {
    private T first;
    private boolean second;

    public ObjectBooleanPair(T first, boolean second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() { return first; }

    public boolean getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ObjectBooleanPair o = (ObjectBooleanPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return new HashCodeBuilder(10753, 33223).append(first).append(second).toHashCode(); }
}
