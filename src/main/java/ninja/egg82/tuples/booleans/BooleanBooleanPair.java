package ninja.egg82.tuples.booleans;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class BooleanBooleanPair {
    private boolean first;
    private boolean second;
    private int hc;

    public BooleanBooleanPair(boolean first, boolean second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(17099, 36451).append(first).append(second).toHashCode();
    }

    public boolean getFirst() { return first; }

    public boolean getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        BooleanBooleanPair o = (BooleanBooleanPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
