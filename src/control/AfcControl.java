package control;

import entity.Fare;
import entity.OnewayTicket;
import entity.PrepaidCard;
import entity.Station;
import entity.Ticket24h;

/**
 * @author Hung Hoang
 * @version 1.0 Nov 30, 2019
 * @project_name AFCSystemV2
 * @teacher_name Thi Thu Trang Nguyen
 * @class_name AfcControl.java
 * @description TODO
 */
public class AfcControl {
    private ITravelingControl control;
    private int procedure;
    private Station station;
    private Fare fare;
    
    public AfcControl(int procedure, Fare fare, Station station) {
        this.procedure = procedure;
        this.fare = fare;
        this.station = station;
        
        if (fare instanceof PrepaidCard) {
            control = new PrepaidCardControl(procedure, fare, station);
        } else if (fare instanceof Ticket24h) {
            control = new Ticket24hControl(procedure, fare, station);
        } else if (fare instanceof OnewayTicket) {
            control = new OnewayTicketControl(procedure, fare, station);
        }
    }
    
    public void process() {
        
        int result = control.process();
        
    }
}
