package ninja.egg82.tuples.booleans;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class BooleanShortPair {
    private boolean first;
    private short second;
    private int hc;

    public BooleanShortPair(boolean first, short second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(25643, 49339).append(first).append(second).toHashCode();
    }

    public boolean getFirst() { return first; }

    public short getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        BooleanShortPair o = (BooleanShortPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
