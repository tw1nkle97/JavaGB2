public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        ConsoleView consoleView = new ConsoleView(phoneBook);
        consoleView.start();

    }

}
