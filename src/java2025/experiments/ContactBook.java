package java2025.experiments;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactBook {
    static class Contact {
        String name;
        String phone;

        Contact(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }

    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to Contact Book!");

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();
                    contacts.add(new Contact(name, phone));
                    System.out.println("Contact added!");
                    break;

                case "2":
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts found.");
                    } else {
                        System.out.println("Your Contacts:");
                        for (int i = 0; i < contacts.size(); i++) {
                            Contact c = contacts.get(i);
                            System.out.println((i + 1) + ". " + c.name + " - " + c.phone);
                        }
                    }
                    break;

                case "3":
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts to delete.");
                    } else {
                        System.out.print("Enter the name of the contact to delete: ");
                        String deleteName = scanner.nextLine();
                        boolean found = false;
                        for (int i = 0; i < contacts.size(); i++) {
                            if (contacts.get(i).name.equalsIgnoreCase(deleteName)) {
                                contacts.remove(i);
                                System.out.println("Contact deleted.");
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Contact not found.");
                        }
                    }
                    break;

                case "4":
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}