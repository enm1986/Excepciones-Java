/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;

import java.io.IOException;

/**
 *
 * @author navar
 */
public class DividirPorZeroException extends Exception{

    public DividirPorZeroException() {
    }

    public DividirPorZeroException(String message) {
        super(message);
    }

}
