package control;

import entity.Fare;
import entity.Station;

/**
 * @author Hung Hoang
 * @version 1.0 Nov 30, 2019
 * @project_name AFCSystemV2
 * @teacher_name Thi Thu Trang Nguyen
 * @class_name OnewayTicketControl.java
 * @description TODO
 */
public class OnewayTicketControl extends ATravelingControl {

    public OnewayTicketControl(int procedure, Fare fare, Station station) {
        super(procedure, fare, station);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int checkIn() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int checkOut() {
        // TODO Auto-generated method stub
        return 0;
    }

}
