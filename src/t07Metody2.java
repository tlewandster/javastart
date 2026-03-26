public class t07Metody2 {
    static void main(String[] args) {

        double mm = (int) (Math.random() * 100);
        double cm = (int) (Math.random() * 100);
        double m = (int) (Math.random() * 100);

        t07Metody2_metricUnitConverter metricConverter = new t07Metody2_metricUnitConverter();

        System.out.println(m + "m to " + metricConverter.convertMToCm(m) + "cm");
        System.out.println(m + "m to " + metricConverter.convertMToMm(m) + "mm");
        System.out.println(cm + "cm to " + metricConverter.convertCmToM(cm) + "m");
        System.out.println(mm + "mm to " + metricConverter.convertMmToM(mm) + "m");

        int s = (int)(Math.random() * 60);
        int min = (int)(Math.random() * 60);
        int h = (int)(Math.random() * 60);

        t07Metody2_timeUnitConverter timeConverter = new t07Metody2_timeUnitConverter();

        System.out.println(h + "h to " + timeConverter.convertHToMin(h) + "min");
        System.out.println(min + "min to " + timeConverter.convertMinToS(min) + "s");
        System.out.println(s + "s to " + timeConverter.convertSToMs(s) + "ms");
    }
}
