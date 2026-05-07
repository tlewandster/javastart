package t46_Strumienie.e2;

import java.util.Comparator;
import java.util.List;

public class Stats {
    private static final List<Match> matches = List.of(
            new Match("Legia Warszawa", "Lech Poznań", 2, 1),
            new Match("Wisła Kraków", "Cracovia", 1, 1),
            new Match("Raków Częstochowa", "Pogoń Szczecin", 3, 0),
            new Match("Śląsk Wrocław", "Jagiellonia Białystok", 0, 2),
            new Match("Górnik Zabrze", "Widzew Łódź", 2, 2),
            new Match("Piast Gliwice", "Zagłębie Lubin", 1, 0),
            new Match("Lechia Gdańsk", "Arka Gdynia", 4, 2),
            new Match("Stal Mielec", "Radomiak Radom", 0, 0),
            new Match("Korona Kielce", "ŁKS Łódź", 3, 1),
            new Match("Ruch Chorzów", "Motor Lublin", 1, 2)
    );

    static void main() {

        printAllResults();
        System.out.println(">>>");
        printTeamResults("ŁKS Łódź");
        System.out.println(">>>");
        printTeamsCount();
        System.out.println(">>>");
        printGoalsCount();
    }

    private static void printGoalsCount() {
        int goals = matches.stream()
                .map(match -> match.getHomeTeamGoals() + match.getAwayTeamGoals())
                .reduce(0, Integer::sum);
        System.out.println("Łączna liczba goli: " + goals);
    }

    private static void printTeamsCount() {
        long count = matches.stream()
                .map(match -> List.of(match.getHomeTeam(), match.getAwayTeam()))
                .flatMap(List::stream)
                .distinct()
                .count();
        System.out.println("Liczba drużyn biorących udział w rozgrywkach: " + count);
    }

    private static void printTeamResults(String team) {
        System.out.println("Wszystkie spotkania " + team + ": ");
        matches.stream()
                .filter(x -> x.getHomeTeam().equals(team) || x.getAwayTeam().equals(team))
                .forEach(System.out::println);
    }


    private static void printAllResults() {
        System.out.println("Wszystkie mecze:");
        matches.stream()
                .sorted(Comparator.comparing(Match::advantage))
                .forEach(System.out::println);
    }
}
