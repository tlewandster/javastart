package t20_Skladowe_statyczne.e3;

public class Car {
    private final int RUNNING_STATUS = 100;
    private final int ENGINE_FAILURE_STATUS = 200;
    private final int NO_FUEL = 300;
    private final int FUEL_OPEN = 400;
    private final int DOORS_OR_BAG_OPEN = 500;
    private int fuelLevel;
    private boolean isEngineFunctional;
    private boolean isFillerClosed;
    private boolean areDoorsClosed;
    private boolean isEngineRunning;

    private int start() {
        if (!isEngineFunctional) {
            return ENGINE_FAILURE_STATUS;
        } else if (fuelLevel == 0) {
            return NO_FUEL;
        }
        this.isEngineRunning = true;
        if (!isFillerClosed) {
            return FUEL_OPEN;
        } else if (!areDoorsClosed) {
            return DOORS_OR_BAG_OPEN;
        } else {
            return RUNNING_STATUS;
        }
    }

    private void status() {

    }
}
