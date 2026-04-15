package t29_Wyjatki.e2;

import java.util.Scanner;

class CompetitionController {
    private final Scanner scanner = new Scanner(System.in);

    void run() {
        Competition competition = null;
        boolean error = true;
        while (error) {
            try {
                competition = createCompetition();
                error = false;
            } catch (Exception e) {
                System.err.println(e.getMessage());
                System.out.println("Spróbuj ponownie");
            }
        }
        fillParticipantsInfo(competition);
        printCompetition(competition);
    }

    private Competition createCompetition() {
        System.out.print("Podaj nazwę zawodów: ");
        String competitionName = scanner.nextLine();
        System.out.print("Podaj maksymalną liczbę uczestników: ");
        int maxParticipants = scanner.nextInt();
        scanner.nextLine();
        if (maxParticipants <= 0) {
            throw new IllegalArgumentException("Maksymalna liczba uczestników musi być dodatnia");
        }
        System.out.print("Podaj ograniczenie wiekowe: ");
        int ageLimit = scanner.nextInt();
        scanner.nextLine();
        return new Competition(competitionName, maxParticipants, ageLimit);
    }

    private void fillParticipantsInfo(Competition competition) {
        while (competition.hasFreeSpots()) {
            System.out.println("Dodaj nowego uczestnika");
            Participant participant;
            try {
                participant = createParticipant();
                try {
                    competition.addParticipant(participant);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        }
    }

    private Participant createParticipant() {
        System.out.print("Podaj imię: ");
        String firstName = scanner.nextLine();
        System.out.print("Podaj nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.print("Podaj id (np. pesel): ");
        String id = scanner.nextLine();
        System.out.print("Podaj wiek: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (age < 0) throw new IllegalArgumentException("Wiek nie może być ujemny!");
        return new Participant(firstName, lastName, id, age);
    }

    private void printCompetition(Competition competition) {
        System.out.println(competition.toString());
    }
}
