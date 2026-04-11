package t10_Metody_i_konstruktory.e2;

public class t07Metody2_timeUnitConverter {
    //zdefiniuj metody związane z przeliczaniem czasu:
    //
    //godzin na minuty
    //minut na sekundy
    //sekund na milisekundy

    int convertHToMin(int h) {
        return h * 60;
    }

    int convertMinToS(int min) {
        return min * 60;
    }

    int convertSToMs(int s) {
        return s * 1000;
    }
}
