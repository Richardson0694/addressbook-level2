package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import seedu.addressbook.data.*;

import java.util.Comparator;
import java.util.List;

public class SortCommand extends Command {
    
    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Displays all persons in the address book as a list in alphabetical order.\n"
            + "Example: " + COMMAND_WORD;
    @Override
    public CommandResult execute() {
        List<ReadOnlyPerson> sortedPersons =  addressBook.sortList().immutableListView();
        return new CommandResult(getMessageForPersonListShownSummary(sortedPersons), sortedPersons);
    }
}
