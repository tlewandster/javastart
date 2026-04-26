package t41_Kolejki.e1;

public class Task implements Comparable<Task>{
    @Override
    public int compareTo(Task o) {
        return o.priority.compareTo(this.priority);
    }

    public enum Priority {
        LOW, MODERATE, HIGH
    }

    private final String name;
    private final String description;
    private final Priority priority;

    public Task(String name, String description, Priority priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name + " (" + priority + ")" + " - " + description;
    }
}
