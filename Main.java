package MVC2;


    public class Main {
        public static void main(String[] args) {
            AddressBookModel model = new AddressBookModel();
            AddressBookView view = new AddressBookView();
            AddressBookController controller = new AddressBookController(model, view);
    
            view.show(); // Show the GUI
    
            // Example: Adding new contacts
            controller.addNewContact();
            controller.addNewContact();
    
            // Update the view to display the contacts
            controller.updateView();
        }
    }

