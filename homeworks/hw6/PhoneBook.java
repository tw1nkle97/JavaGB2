import java.util.ArrayList;
import java.util.List;


public class PhoneBook {
    private List<Contact> contacts;
    public PhoneBook() {
        contacts = FileCSV.readFromCSV("contacts.csv");
        new FileCSV();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Контакт успешно добавлен");
        FileCSV.writeToCSV(contacts, "contacts.csv");
    }

    public void removeContact(String idContact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getIdContact().equals(idContact)) {
                contacts.remove(i);
                System.out.println("Контакт успешно удален");
                FileCSV.writeToCSV(contacts, "contacts.csv");
                return;
            }
        }
        System.out.println("Контакт не найден");
    }

    public void updateContact(String idContact, String newFirstName, String newLastName, String newPhone) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getIdContact().equals(idContact)) {
                Contact contact = contacts.get(i);
                contact.setFirstName(newFirstName);
                contact.setLastName(newLastName);
                contact.setPhone(newPhone);
                System.out.println("Контакт успешно обновлен");
                FileCSV.writeToCSV(contacts, "contacts.csv");
                return;
            }
        }
        System.out.println("Контакт не найден");
    }

    public void searchByName(String name) {
        List<Contact> result = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(name)) {
                result.add(contact);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Контакт не найден");
        } else {
            for (Contact contName : result) {
                System.out.println(contName);
            }
        }
    }

    public void searchByPhone(String phone) {
        List<Contact> result = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getPhone().equals(phone)) {
                result.add(contact);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Контакт не найден");
        } else {
            for (Contact contPhone : result) {
                System.out.println(contPhone);
            }
        }
    }

    public void importFromCSV(String fileName) {
        List<Contact> importedContacts = FileCSV.readFromCSV(fileName);
        contacts.addAll(importedContacts);
        FileCSV.writeToCSV(contacts, "C:/programming/GeekBrains/JavaGB2/homeworks/hw6/contacts.csv");
        System.out.println("В телефонный справочник добавлены контакты из файла " + fileName);
    }

    public void exportToCSV(String fileName) {
        FileCSV.writeToCSV(contacts, fileName);
        System.out.println("Контакты телефонного справочника экспортированы в файл " + fileName);
    }

    public void displayContacts() {
        List<Contact> csvContacts = FileCSV.readFromCSV("C:/programming/GeekBrains/JavaGB2/homeworks/hw6/contacts.csv");
        System.out.println("Телефонный справочник:");
        for (Contact contact : csvContacts) {
            System.out.println(contact);
        }
    }

}