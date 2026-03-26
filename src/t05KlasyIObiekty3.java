public class t05KlasyIObiekty3 {
    static void main(String[] args) {
        Plant plant1 = new Plant();
        plant1.name = "Kaktus";
        plant1.waterDemandPerDay = 0.1;

        Plant plant2 = new Plant();
        plant2.name = "Orchidea";
        plant2.waterDemandPerDay = 0.5;

        Plant plant3 = new Plant();
        plant3.name = "Fikołek";
        plant3.waterDemandPerDay = 0.35;

        double sumOfWaterDemandPerDay = plant1.waterDemandPerDay + plant2.waterDemandPerDay + plant3.waterDemandPerDay;
        double sumOfWaterdemandPerWeek = sumOfWaterDemandPerDay * 7;
        double sumOfWaterdemandPerYear = sumOfWaterDemandPerDay * 365;

        System.out.println("Sumaryczne zużycie wody:");
        System.out.println(" - dzienne: " + sumOfWaterDemandPerDay + " litrów");
        System.out.println(" - tygodniowe: " + sumOfWaterdemandPerWeek + " litrów");
        System.out.println(" - roczne: " + sumOfWaterdemandPerYear + " litrów");


    }

    static class Plant {
        String name;
        double waterDemandPerDay;
    }
}
