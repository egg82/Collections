package ninja.egg82.tuples.ints;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class IntLongPair {
    private int first;
    private long second;
    private int hc;

    public IntLongPair(int first, long second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(55171, 9491).append(first).append(second).toHashCode();
    }

    public int getFirst() { return first; }

    public long getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        IntLongPair o = (IntLongPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
