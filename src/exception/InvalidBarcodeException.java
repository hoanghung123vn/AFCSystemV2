package exception;

/**
 * @author Hung Hoang
 * @version 1.0 Nov 30, 2019
 * @project_name AFCSystemV2
 * @teacher_name Thi Thu Trang Nguyen
 * @class_name InvalidBarcodeException.java
 * @description TODO
 */
public class InvalidBarcodeException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -6339799262471926762L;
    
    public InvalidBarcodeException(String message) {
        super(message);
    }
}
