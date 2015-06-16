/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author stewart
 */
public class Logic {

    private double total = 0;
    private double buffer = 0;

    // initialize
    public void init() {
        this.total = 0;
        this.buffer = 0;

    }

    // constructor
    public Logic() {
        this.init();
    }

    public void new_val(double val) {
        this.total += val;
    }

}
