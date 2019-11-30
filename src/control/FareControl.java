package control;

import java.util.ArrayList;
import java.util.HashMap;

import config.Config;
import entity.Fare;
import util.FileReader;

/**
 * @author Hung Hoang
 * @version 1.0 Nov 30, 2019
 * @project_name AFCSystemV2
 * @teacher_name Thi Thu Trang Nguyen
 * @class_name FareControl.java
 * @description TODO
 */
public class FareControl {
    private ArrayList<String> barcodes;
    
    public FareControl() {
        this.barcodes = FileReader.readFile(Config.BARCODE_PATH);
    }
    
    public HashMap<String, Fare> getListFares() {
        return null;
    }
}
