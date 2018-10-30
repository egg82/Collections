package ninja.egg82.tuples.objects;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ObjectDoublePair<T> {
    private T first;
    private double second;

    public ObjectDoublePair(T first, double second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() { return first; }

    public double getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ObjectDoublePair o = (ObjectDoublePair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return new HashCodeBuilder(11657, 49081).append(first).append(second).toHashCode(); }
}
