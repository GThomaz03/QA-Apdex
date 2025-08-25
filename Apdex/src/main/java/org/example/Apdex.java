//Gabriel Alves Thomaz - RM558637

package org.example;

public class Apdex {
    private int satifatorio;
    private int toleravel;
    private int total;

    public Apdex(){

    }

    public double calcApdex(double satifatorio, double toleravel, double total){
        return (double) (satifatorio + (toleravel / 2)) /total;
    }


}
