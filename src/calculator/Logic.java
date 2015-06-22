/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.text.DecimalFormat;

/**
 *
 * @author stewart
 * tt
 */
public class Logic {

    private double total = 0;
    private String buffer_1 = "0";
    private String screen = "0";
    private Boolean point_flag = false;

    // initialize
    public void init() {
        this.total = 0;
        this.buffer_1 = "0";
        this.screen = "0";
        this.point_flag = false;
        //    super.jTextArea1.setText("" + this.getScreen());

        /* 
         console test output
         */
        double num = 5;
        System.out.println("look at double: " + num);
        String numstring = "348.345";
        System.out.println("look parsed: " + Double.parseDouble(numstring));

    }

    // constructor
    public Logic() {
        this.init();
    }

    public void new_val(char val) {
//point_flag 
        switch (val) {
            case '.':
                if (!point_flag) {
                    this.buffer_1 = buffer_1 + val + "0";
                    this.point_flag = true;

                }
                break;
            default:
                if (this.buffer_1 != "0") {
                    this.buffer_1 = buffer_1 + val;
                } else {
                    this.buffer_1 = "" + val;
                }

                // test if digit needs double
        }
        this.screen = this.buffer_1;
               // jTextArea1.setText(getScreen());


    }

    //
    //    public String getBufferedNum() {
    //        return this.buffer_1;
    //        //        return Double.parseDouble(this.buffer_1);
    //
    //    }
    //    public double getTotal() {
    //        return this.total;
    //    }
    public String getScreen() {
        return this.screen;

    }

    public void plus() {

        this.total += Double.parseDouble(this.buffer_1);
        this.buffer_1 = "0";

        //
        if ((this.total % 1) != 0) {
            this.screen = "" + this.total;
        } else {
            DecimalFormat format = new DecimalFormat("0.#");

            this.screen = "" + (format.format(this.total));
        }

        //
//        Double price = 5.000;
//        DecimalFormat format = new DecimalFormat("0.#");
//        System.out.println(format.format(price));
        //
        //
        // this.screen = "" + this.total;
        this.point_flag = false;

    }

    public void clear() {
        this.buffer_1 = "0";
        this.screen = "" + this.total;
    }

}
