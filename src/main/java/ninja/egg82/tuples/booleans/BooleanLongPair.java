package ninja.egg82.tuples.booleans;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class BooleanLongPair {
    private boolean first;
    private long second;
    private int hc;

    public BooleanLongPair(boolean first, long second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(32369, 38461).append(first).append(second).toHashCode();
    }

    public boolean getFirst() { return first; }

    public long getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        BooleanLongPair o = (BooleanLongPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
