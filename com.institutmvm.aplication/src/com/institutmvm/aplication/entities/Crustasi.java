package com.institutmvm.aplication.entities;

import java.util.Date;


/**
 * Class Crustaci
 *
 * Clase específica que serveix per declarar les propietats i métodes genérics dels crustacis
 */

public class Crustasi extends Especimen{

        /** Propietats */

        private int numeroEmbarcacions;
        private String tempsNavegacio, nubositat, ventDireccio, color;
        private float ventVelocitat;
        private boolean faltenExtremitats, danysExoesquelet;


        /** Constructor */

        public Crustasi( String especie, String habitat, float mida, Date tempsArribada, int numeroEmbarcacions,
                        int temperaturaSuperficial, String tempsNavegacio, String nubositat, String ventDireccio,
                        String color, float ventVelocitat) {
            super( temperaturaSuperficial, especie, habitat, mida, tempsArribada);
            this.setNumeroEmbarcacions(numeroEmbarcacions);

            this.setTempsNavegacio(tempsNavegacio);
            this.setNubositat(nubositat);
            this.setVentDireccio(ventDireccio);
            this.setColor(color);
            this.setVentVelocitat(ventVelocitat);
            this.setFaltenExtremitats(faltenExtremitats);
            this.setDanysExoesquelet(danysExoesquelet);
        }

        /** Setters & getters */

        /** S&G > numeroEmbarcacions */

        /** Retorna el valor de el numero de embarcacions del crustaci > @return int */
        public int getNumeroEmbarcacions() {
            return numeroEmbarcacions;
        }

        /** Assigna un valor al numero de embarcacions del crustaci < @param numeroEmbarcacions */
        public void setNumeroEmbarcacions(int numeroEmbarcacions) {
            this.numeroEmbarcacions = numeroEmbarcacions;
        }


        /** S&G > tempsNavegacio */

        /** Retorna el valor del temps de navegacio de crustaci > @return String */
        public String getTempsNavegacio() {
            return tempsNavegacio;
        }

        /** Assigna un valor al temps de navegacio del crustaci < @param tempsNavegacio */
        public void setTempsNavegacio(String tempsNavegacio) {
            this.tempsNavegacio = tempsNavegacio;
        }

        /** S&G > nubositat */

        /** Retorna el valor de la nubositat de crustaci > @return String */
        public String getNubositat() {
            return nubositat;
        }

        /** Assigna un valor al temps de navegacio del crustaci < @param tempsNavegacio */
        public void setNubositat(String nubositat) {
            this.nubositat = nubositat;
        }

        /** S&G > ventDireccio */

        /** Retorna el valor de la direccio del vent de crustaci > @return String */
        public String getventDireccio() {
            return ventDireccio;
        }

        /** Assigna un valor a la direccio del vent del crustaci < @param tempsNavegacio */
        public void setVentDireccio(String ventDireccio) {
            this.ventDireccio = ventDireccio;
        }

        /** S&G > color */

        /** Retorna el valor del color de crustaci > @return String */
        public String getColor() {
            return color;
        }

        /** Assigna un valor al color del crustaci < @param tempsNavegacio */
        public void setColor(String color) {
            this.color = color;
        }

        /** S&G > ventVelocitat */

        /** Retorna el valor del vent de la velocitat del crustaci > @return float */
        public float getVentVelocitat() {
            return ventVelocitat;
        }

        /** Assigna un valor sobre el vent de la velocitat del crustaci < @param ventVelocitat */
        public void setVentVelocitat(float ventVelocitat) {
            this.ventVelocitat = ventVelocitat;
        }

        /** S&G > faltenExtremitats */

        /** Retorna el valor sobre si li falten extremitats el crustaci > @return boolean */
        public boolean getFaltenExtremitats() {
            return faltenExtremitats;
        }

        /** Retorna el valor sobre si li falten extremitats el crustaci > @return boolean */
        public void setFaltenExtremitats(boolean faltenExtremitats) {
            this.faltenExtremitats = faltenExtremitats;
        }

        /** S&G > danysExoesquelet */

        /** Retorna el valor sobre si te danys al exoesquelet el crustaci > @return boolean */
        public boolean getDanysExoesquelet() {
            return danysExoesquelet;
        }

        /** Retorna el valor sobre si te danys al exoesquelet el crustaci > @return boolean */
        public void setDanysExoesquelet(boolean danysExoesquelet) {
            this.danysExoesquelet = danysExoesquelet;
        }

}

