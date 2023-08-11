package MVC2;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class AddressBookView {
    private JFrame frame;
    private DefaultListModel<String> listModel;
    private JList<String> contactList;

    public AddressBookView() {
        frame = new JFrame("Address Book");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        listModel = new DefaultListModel<>();
        contactList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(contactList);

        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    public void displayContacts(List<Contact> contacts) {
        listModel.clear();
        for (Contact contact : contacts) {
            listModel.addElement(contact.getName() + " - " + contact.getPhoneNumber() + " - " + contact.getEmailAddress());
        }
    }

    public Contact getNewContactDetails() {
        String name = JOptionPane.showInputDialog("Enter contact name:");
        String phoneNumber = JOptionPane.showInputDialog("Enter contact phone number:");
        String emailAddress = JOptionPane.showInputDialog("Enter contact email address:");

        return new Contact(name, phoneNumber, emailAddress);
    }

    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(frame, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void showSuccessMessage(String message) {
        JOptionPane.showMessageDialog(frame, message, "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    public void show() {
        frame.setVisible(true);
    }
}

