package ninja.egg82.tuples.doubles;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class DoubleObjectPair<T> {
    private double first;
    private T second;

    public DoubleObjectPair(double first, T second) {
        this.first = first;
        this.second = second;
    }

    public double getFirst() { return first; }

    public T getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        DoubleObjectPair o = (DoubleObjectPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return new HashCodeBuilder(59539, 547).append(first).append(second).toHashCode(); }
}
