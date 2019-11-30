package boudary;

import control.AfcControl;
import entity.Fare;
import entity.Station;

/**
 * @author Hung Hoang
 * @version 1.0 Nov 30, 2019
 * @project_name AFCSystemV2
 * @teacher_name Thi Thu Trang Nguyen
 * @class_name Screen.java
 * @description TODO
 */
public class Screen {
    public void start() {
        int procedure = getInputProcedure();
        Station station = getInputStation();
        Fare fare = getInputFare();
      
        AfcControl afcontrol = new AfcControl(procedure, fare, station);
        afcontrol.process();
    }
    
    public int getInputProcedure() {
        return 0;
        
    }
    
    public Station getInputStation() {
        return null;
        
    }
    
    public Fare getInputFare() {
        return null;
        
    }
}
