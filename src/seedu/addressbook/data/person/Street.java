package seedu.addressbook.data.person;

/**
 * Represents a Address's street in the address book
 *
 */
public class Street {

    public static final String EXAMPLE = "Clementi Ave 3";
    public static final String MESSAGE_STREET_CONSTRAINTS = "Address streets can be in any format";

    public final String street;

    public Street(String street) {
        this.street = street;
    }

    public String getStreet() { return street; }

    @Override
    public String toString() {
        return street;
    }

}
