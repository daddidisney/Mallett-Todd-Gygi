/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author wesmallett
 */
public class MapControlException extends RuntimeException{
    public MapControlException() {
    }
    
    public MapControlException(String message) {
        super(message);
    }
    
    public MapControlException(Throwable cause) {
        super(cause);
    }
    
    public MapControlException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public MapControlException(String message, Throwable cause, Boolean enableSuppression, Boolean writableStacktrace) {
        super(message, cause, enableSuppression, writableStacktrace);
    }
    
}
