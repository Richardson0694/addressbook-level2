package seedu.addressbook.data.person;

/**
 * Represents a Address's unit in the address book
 *
 */
public class Unit {

    public static final String EXAMPLE = "#12-34";
    public static final String MESSAGE_UNIT_CONSTRAINTS = "Address units can be in any format";

    public final String unit;

    public Unit(String unit) {
        this.unit = unit;
    }

    public String getUnit() { return unit; }

    @Override
    public String toString() {
        return unit;
    }

}
