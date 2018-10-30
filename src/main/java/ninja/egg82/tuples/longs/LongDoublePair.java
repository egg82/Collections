package ninja.egg82.tuples.longs;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class LongDoublePair {
    private long first;
    private double second;
    private int hc;

    public LongDoublePair(long first, double second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(9679, 4159).append(first).append(second).toHashCode();
    }

    public long getFirst() { return first; }

    public double getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        LongDoublePair o = (LongDoublePair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
