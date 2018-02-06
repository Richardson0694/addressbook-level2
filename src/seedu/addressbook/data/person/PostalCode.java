package seedu.addressbook.data.person;

/**
 * Represents a Address's postal code in the address book
 *
 */
public class PostalCode {

    public static final String EXAMPLE = "231534";
    public static final String MESSAGE_POSTALCODE_CONSTRAINTS = "Address postal codes can be in any format";

    public final String postalCode;

    public PostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return postalCode;
    }

}
