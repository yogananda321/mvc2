package MVC2;

import java.util.List;

public class AddressBookController {
    private AddressBookModel model;
    private AddressBookView view;

    public AddressBookController(AddressBookModel model, AddressBookView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        List<Contact> contacts = model.getContacts();
        view.displayContacts(contacts);
    }

    public void addNewContact() {
        Contact newContact = view.getNewContactDetails();

        if (newContact.getName().isEmpty() || newContact.getPhoneNumber().isEmpty() || newContact.getEmailAddress().isEmpty()) {
            view.showErrorMessage("Please fill in all contact details.");
        } else {
            model.addContact(newContact);
            view.showSuccessMessage("Contact added successfully!");
        }
    }

    public void removeContact(Contact contact) {
        model.removeContact(contact);
        view.showSuccessMessage("Contact removed successfully!");
    }

    // Other methods for updating and managing contacts if needed
}

