package t32_Operacje_na_plikach.e2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ClientsApp {
    static void main() {
        var sc = new Scanner(System.in);
        final String fileName = "clients.csv";
        Client[] clients = readClientsFromFile(fileName);
        findMaxValueClient(clients);
        System.out.println("Podaj nazwę kraju, z którego klienci Cię interesują:");
        String country = sc.nextLine();
        findClientsFromCountry(clients, country);
    }



    private static long countLines(String fileName) {
        Path path = Paths.get(fileName);
        long lines = 0;
        try {
            lines = Files.lines(path).count();
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku " + fileName);
            e.printStackTrace();
        }
        return lines;
    }

    private static Client[] readClientsFromFile(String fileName) {
        String line;
        long lines = countLines(fileName);
        Client[] clients = new Client[(int) lines - 1];
        final String separator = ",";
        int i = 0;
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while ((line = bufferedReader.readLine()) != null) {
                if (i++ != 0) {
                    String[] fields = line.split(separator);
                    clients[i - 2] = new Client(fields[0], fields[1], fields[2], fields[3], fields[4]);
                }
            }
        } catch (Exception e) {
            System.out.println("Błąd odczytu pliku " + fileName);
            e.printStackTrace();
        }
        return clients;
    }

    private static void findMaxValueClient(Client[] clients) {
        int index = 0;
        int highestValueIndex = 0;
        for (Client client : clients) {
            if (client.getValue() > clients[highestValueIndex].getValue()) {
                highestValueIndex = index;
            }
            index++;
        }
        System.out.println("Najbardziej wartościowy klient to " + clients[highestValueIndex]);
    }

    private static void findClientsFromCountry(Client[] clients, String country) {
        System.out.println("Klienci z kraju " + country + ":");
        int count = 0;
        double valueSum = 0;
        for (Client client : clients) {
            if (client.getCountry().equals(country)) {
                System.out.println(client);
                count++;
                valueSum += client.getValue();
            }
        }
        if (count == 0) {
            System.out.println("Brak klientów z podanego kraju.");
        } else {
            System.out.printf("Średnia wartość klienta z %s to %.2fzł", country,  (valueSum / count));
        }
    }
}
