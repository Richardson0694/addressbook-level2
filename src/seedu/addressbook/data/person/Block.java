package seedu.addressbook.data.person;

/**
 * Represents a Address's block in the address book
 *
 */
public class Block {

    public static final String EXAMPLE = "123";
    public static final String MESSAGE_BLOCK_CONSTRAINTS = "Address blocks can be in any format";

    public final String block;

    public Block(String block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return block;
    }

}
