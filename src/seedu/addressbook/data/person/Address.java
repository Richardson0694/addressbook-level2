package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street, some unit, some postal code";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses should be in format of block, street, unit, postal code";
    public static final String ADDRESS_VALIDATION_REGEX = "(.+,)(.+,)(.+,)(.+)";

    public final String value;
    private boolean isPrivate;

    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalCode;
    private static final String ADDRESS_SPLIT_REGEX = ",";
    private static final int ADDRESS_DATA_INDEX_BLOCK = 0;
    private static final int ADDRESS_DATA_INDEX_STREET = 1;
    private static final int ADDRESS_DATA_INDEX_UNIT = 2;
    private static final int ADDRESS_DATA_INDEX_POSTALCODE = 3;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();

        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }

        String splitAddress[] = trimmedAddress.split(ADDRESS_SPLIT_REGEX);
        this.block = new Block(splitAddress[ADDRESS_DATA_INDEX_BLOCK]);
        this.street = new Street(splitAddress[ADDRESS_DATA_INDEX_STREET]);
        this.unit = new Unit(splitAddress[ADDRESS_DATA_INDEX_UNIT]);
        this.postalCode = new PostalCode(splitAddress[ADDRESS_DATA_INDEX_POSTALCODE]);

        this.value = block.getBlock() + "," +
                street.getStreet() + "," +
                unit.getUnit() + "," +
                postalCode.getPostalCode();
    }

    /**
     * Returns true if a given string is a valid person address.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }

}
