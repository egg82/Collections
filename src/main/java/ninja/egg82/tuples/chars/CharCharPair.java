package ninja.egg82.tuples.chars;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class CharCharPair {
    private char first;
    private char second;
    private int hc;

    public CharCharPair(char first, char second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(51383, 9109).append(first).append(second).toHashCode();
    }

    public char getFirst() { return first; }

    public char getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        CharCharPair o = (CharCharPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
