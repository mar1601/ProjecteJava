/**
 * Class Especimen
 *
 * Clase genérica que serveix per declarar les propietats i métodes genérics de cualsevol espécimen
 */
package com.institutmvm.aplication.entities;

import java.util.Date;

abstract class Especimen {

        /** Propietats */

        private int temperaturaSuperficial;
        private String especie, habitat;
        private float mida;
        private Date tempsArribada;

        /** Constructor */

        public Especimen( int temperaturaSuperficial, String especie, String habitat, float mida, Date tempsArribada) {
            this.setTemperaturaSuperficial(temperaturaSuperficial);
            this.setEspecie(especie);
            this.setHabitat(habitat);
            this.setMida(mida);
            this.setTempsArribada(tempsArribada);
        }


    /** Setters & getters */

        /** S&G > temperaturaSuperficial */

        /** Retorna el valor de la id del especimen > @return int */
        public int getTemperaturaSuperficial() {
            return temperaturaSuperficial;
        }

        /** Assigna un valor a la id del especimen < @param id */
        public void setTemperaturaSuperficial(int temperaturaSuperficial) {
            this.temperaturaSuperficial = temperaturaSuperficial;
        }

        /** S&G > especie */

        /** Retorna el valor de la especie del especimen > @return String */
        public String getEspecie() {
            return especie;
        }

        /** Assigna un valor a la especie del especimen < @param especie */
        public void setEspecie(String especie) {
            this.especie = especie;
        }

        /** S&G > habitat */

        /** Retorna el valor de la habitat del especimen > @return String */
        public String getHabitat() {
            return habitat;
        }

        /** Assigna un valor a la habitat del especimen < @param habitat */
        public void setHabitat(String habitat) {
            this.habitat = habitat;
        }

        /** S&G > mida */

        /** Retorna el valor de la mida del especimen > @return float */
        public float getMida() {
            return mida;
        }

        /** Assigna un valor a la mida del especimen < @param mida */
        public void setMida(float mida) {
            this.mida = mida;
        }

        /** S&G > tempsArribada */

        /** Retorna el valor de la mida del especimen > @return Date */
        public Date getTempsArribada() {
            return tempsArribada;
        }

        /** Assigna un valor a la mida del especimen < @param tempsArribada */
        public void setTempsArribada(Date tempsArribada) {
            this.tempsArribada = tempsArribada;
        }

    }
