package ninja.egg82.tuples.objects;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ObjectObjectPair<F, S> {
    private F first;
    private S second;

    public ObjectObjectPair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() { return first; }

    public S getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ObjectObjectPair o = (ObjectObjectPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return new HashCodeBuilder(25163, 53479).append(first).append(second).toHashCode(); }
}
