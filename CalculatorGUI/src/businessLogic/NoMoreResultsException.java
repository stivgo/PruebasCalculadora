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
public class NoMoreResultsException extends Exception {

    public NoMoreResultsException() {
        super("There is no more results to show");
    }
    
}
