package com.institutmvm.aplication.entities;

import java.util.Date;


/**
 * Class Alga
 *
 * Clase específica que serveix per declarar les propietats i métodes genérics de les algues
 */

public class Alga extends Especimen{

    /** Propietats */

    private String  color;

    /** Constructor */

    public Alga( String especie, String habitat, float mida, Date tempsArribada,
                 int temperaturaSuperficial, String color) {
        super( temperaturaSuperficial, especie, habitat, mida, tempsArribada);

        this.setColor(color);

    }

    /** Setters & getters */


    /** S&G > color */

    /** Retorna el valor del color del alga > @return String */
    public String getColor() {
        return color;
    }

    /** Assigna un valor al color de l alga < @param tempsNavegacio */
    public void setColor(String color) {
        this.color = color;
    }


}

