package t50_Rekordy.e1;

import java.time.LocalDate;

public record DailyTemperature(LocalDate date,
                               double minTemperature,
                               double maxTemperature,
                               TempUnit unit
) {
    public enum TempUnit {
        CELSIUS, FAHRENHEIT
    }

    public double tempInUnit(double temperature, TempUnit unit) {
        if (unit == this.unit) {
            return temperature;
        } else if (unit == TempUnit.CELSIUS) {
            return (temperature - 32) * 5 / 9;
        } else {
            return (temperature * 9 / 5) + 32;
        }
    }


}
