public class t07Metody2_metricUnitConverter {
    //Zdefiniuj klasę, która będzie posiadała metody do przeliczania jednostek metrycznych:
    //
    //metrów na centymetry
    //metrów na milimetry
    //centymetrów na metry
    //milimetrów na metry

    double convertMToCm(double m) {
        return m * 100;
    }

    double convertMToMm(double m) {
        return m * 1000;
    }

    double convertCmToM(double cm) {
        return cm / 100;
    }

    double convertMmToM(double mm) {
        return mm / 1000;
    }
}
