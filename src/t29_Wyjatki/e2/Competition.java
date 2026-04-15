package t29_Wyjatki.e2;

class Competition {
    private final String name;
    private final Participant[] participants;
    private final int ageLimit;
    private int size;

    public Competition(String name, int maxParticipants, int ageLimit) {
        this.name = name;
        this.ageLimit = ageLimit;
        this.participants = new Participant[maxParticipants];
    }

    void addParticipant(Participant participant) {
        if (participant.getAge() < ageLimit) throw new AgeViolationException("Uczestnik ma poniżej " + ageLimit + " lat");
        if (size >= participants.length) throw new MaxCompetitorsException("Brak wolnych miejsc w zawodach");
        participants[size] = participant;
        size++;
    }

    boolean hasFreeSpots() {
        return size < participants.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Zawody ")
                .append(name)
                .append("\n")
                .append("Liczba uczestników: ").append(size);
        for (int i = 0; i < size; i++) {
            builder.append("\n");
            builder.append(" > ");
            builder.append(participants[i].toString());
        }
        return builder.toString();
    }
}
