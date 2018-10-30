package ninja.egg82.tuples.chars;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class CharBooleanPair {
    private char first;
    private boolean second;
    private int hc;

    public CharBooleanPair(char first, boolean second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(19447, 61583).append(first).append(second).toHashCode();
    }

    public char getFirst() { return first; }

    public boolean getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        CharBooleanPair o = (CharBooleanPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
