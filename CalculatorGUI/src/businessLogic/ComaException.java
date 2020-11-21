/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

/**
 *
 * @author John Gonzalez
 */
public class ComaException extends Exception {

    public ComaException() {
        super("An expression cannot have two comas");
    }
    
}
