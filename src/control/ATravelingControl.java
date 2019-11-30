package control;

import entity.Fare;
import entity.Station;

/**
 * @author Hung Hoang
 * @version 1.0 Nov 30, 2019
 * @project_name AFCSystemV2
 * @teacher_name Thi Thu Trang Nguyen
 * @class_name AFareControl.java
 * @description TODO
 */
public abstract class ATravelingControl implements ITravelingControl {
    private int procedure;
    private Fare fare;
    private Station station;

    public ATravelingControl(int procedure, Fare fare, Station station) {
        this.procedure = procedure;
        this.fare = fare;
        this.station = station;
    }

    @Override
    public int process() {
        if (procedure == 1) {
            return checkIn();
        } else if (procedure == 2) {
            return checkOut();
        }
        return -1;
    }
    
    public abstract int checkIn();
    public abstract int checkOut();
}
