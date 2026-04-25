package t40_Kolejki.e1;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {
    static Scanner sc = new Scanner(System.in);
    static Queue<Task> tasks = new PriorityQueue<>();

    static void main() {
        boolean exit = false;
        while (!exit) {
            System.out.println("1 - dodaj zadanie");
            System.out.println("2 - pobierz kolejne zadanie");
            System.out.println("3 - Zakończ program");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    getTask();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Niewłaściwa opcja");
                    break;
            }
        }
    }

    private static void getTask() {
        if (tasks.isEmpty()) {
            System.out.println("Brak zadań");
        } else {
            System.out.println(tasks.poll());
        }
    }

    private static void addTask() {
        System.out.println("Tytuł zadania: ");
        String title = sc.nextLine();
        System.out.println("Opis zadania: ");
        String desc = sc.nextLine();
        System.out.println("Priorytet zadania (LOW, MODERATE, HIGH): ");
        Task.Priority priority = Task.Priority.valueOf(sc.nextLine().toUpperCase());
        tasks.offer(new Task(title, desc, priority));
    }
}
