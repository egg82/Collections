package ninja.egg82.tuples.chars;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class CharLongPair {
    private char first;
    private long second;
    private int hc;

    public CharLongPair(char first, long second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(19739, 57809).append(first).append(second).toHashCode();
    }

    public char getFirst() { return first; }

    public long getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        CharLongPair o = (CharLongPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
