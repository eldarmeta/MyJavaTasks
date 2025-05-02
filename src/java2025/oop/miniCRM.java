package java2025.oop;

import java.sql.*;
import java.util.*;

public class miniCRM {

    static class Client {
        int id;
        String name;
        String email;
        String status;

        public Client(int id, String name, String email, String status) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.status = status;
        }

        @Override
        public String toString() {
            return String.format("ID: %d | Name: %s | Email: %s | Status: %s", id, name, email, status);
        }
    }

    static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:clients.db");
    }

    static void createTable() {
        try (Connection conn = connect();
             Statement stmt = conn.createStatement()) {
            String sql = """
                    CREATE TABLE IF NOT EXISTS clients (
                        id INTEGER PRIMARY KEY AUTOINCREMENT,
                        name TEXT NOT NULL,
                        email TEXT NOT NULL,
                        status TEXT NOT NULL
                    );
                    """;
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
        }
    }

    static void addClient(String name, String email, String status) {
        String sql = "INSERT INTO clients (name, email, status) VALUES (?, ?, ?)";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, status);
            pstmt.executeUpdate();
            System.out.println("✅ Client added!");
        } catch (SQLException e) {
            System.out.println("Error inserting client: " + e.getMessage());
        }
    }

    static List<Client> getAllClients() {
        List<Client> clients = new ArrayList<>();
        String sql = "SELECT * FROM clients";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                clients.add(new Client(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("status")));
            }
        } catch (SQLException e) {
            System.out.println("Error reading clients: " + e.getMessage());
        }
        return clients;
    }

    public static void main(String[] args) {
        createTable();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== MINI CRM ===");
            System.out.println("1. Add client");
            System.out.println("2. Show all clients");
            System.out.println("3. Sort clients by name");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // flush

            switch (choice) {
                case 1 -> {
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Status (Active / Inactive): ");
                    String status = scanner.nextLine();
                    addClient(name, email, status);
                }
                case 2 -> {
                    List<Client> clients = getAllClients();
                    if (clients.isEmpty()) {
                        System.out.println("No clients found.");
                    } else {
                        clients.forEach(System.out::println);
                    }
                }
                case 3 -> {
                    List<Client> clients = getAllClients();
                    clients.sort(new Comparator<Client>() {
                        public int compare(Client a, Client b) {
                            return a.name.compareToIgnoreCase(b.name);
                        }
                    });
                    clients.forEach(System.out::println);
                }
                case 4 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
