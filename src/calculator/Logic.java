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
    private double buffer_1 = 0;
    private double buffer_2 = 0;
    private double screen = 0;

    // initialize
    public void init() {
        this.total = 0;
        this.buffer_1 = 0;
        this.buffer_2 = 0;
        this.screen = 0;

    }

    // constructor
    public Logic() {
        this.init();
    }

    public void new_val(double val) {

//        if (this.total == 0.0) {
//            this.total = val;
//            this.buffer_1 = 0;
//        } else {
//            this.buffer_1 = val;
//        }
        this.buffer_1 = val;
        this.screen = this.buffer_1;
    }

    public double getBufferedNum() {
        return this.buffer_1;
    }

    public double getTotal() {
        return this.total;
    }

    public double getScreen() {
        return this.screen;
    }

    public void plus() {

        this.total += this.buffer_1;
        this.buffer_1 = 0;
        this.screen = this.total;
    }

}
