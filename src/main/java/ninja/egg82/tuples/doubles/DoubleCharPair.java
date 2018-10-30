package ninja.egg82.tuples.doubles;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class DoubleCharPair {
    private double first;
    private char second;
    private int hc;

    public DoubleCharPair(double first, char second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(53381, 26669).append(first).append(second).toHashCode();
    }

    public double getFirst() { return first; }

    public char getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        DoubleCharPair o = (DoubleCharPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
