package t28_Klasa_String.e4;

public class ProgressBar {
    static void main() {
        double percent = 0.0;
        String reel = "/";
        StringBuilder bar = new StringBuilder();
        while (percent <= 100) {
            reel = reel.equals("/") ? "\\" : "/";
            if (percent > 0 && percent % 10 == 0) bar.append("#");
            System.out.printf("Wczytywanie %s %.1f%% (%-10s)\r", reel, percent, bar);
            percent += 0.5;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
