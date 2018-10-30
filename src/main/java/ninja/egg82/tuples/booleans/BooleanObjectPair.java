package ninja.egg82.tuples.booleans;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class BooleanObjectPair<T> {
    private boolean first;
    private T second;

    public BooleanObjectPair(boolean first, T second) {
        this.first = first;
        this.second = second;
    }

    public boolean getFirst() { return first; }

    public T getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        BooleanObjectPair o = (BooleanObjectPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return new HashCodeBuilder(12157, 48679).append(first).append(second).toHashCode(); }
}
