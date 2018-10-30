package ninja.egg82.tuples.chars;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class CharDoublePair {
    private char first;
    private double second;
    private int hc;

    public CharDoublePair(char first, double second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(25171, 5821).append(first).append(second).toHashCode();
    }

    public char getFirst() { return first; }

    public double getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        CharDoublePair o = (CharDoublePair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
