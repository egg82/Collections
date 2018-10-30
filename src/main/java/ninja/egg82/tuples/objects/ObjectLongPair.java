package ninja.egg82.tuples.objects;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ObjectLongPair<T> {
    private T first;
    private long second;

    public ObjectLongPair(T first, long second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() { return first; }

    public long getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ObjectLongPair o = (ObjectLongPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return new HashCodeBuilder(53899, 10993).append(first).append(second).toHashCode(); }
}
