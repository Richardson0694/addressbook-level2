package seedu.addressbook.data.person;

public class Contact {
    
    public String value;
    public boolean isPrivate;

    /**
     * Returns true if the given string is a valid person email.
     */
    public static boolean isValid(String test, String regex) {
        return test.matches(regex);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
    
    public boolean isPrivate() {
        return isPrivate;
    }
    
}
