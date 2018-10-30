package ninja.egg82.tuples.ints;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class IntObjectPair<T> {
    private int first;
    private T second;

    public IntObjectPair(int first, T second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() { return first; }

    public T getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        IntObjectPair o = (IntObjectPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return new HashCodeBuilder(26053, 49757).append(first).append(second).toHashCode(); }
}
