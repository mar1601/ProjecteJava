package com.institutmvm.aplication.entities;

import java.util.Date;

/**
 * Class Tauro
 *
 * Clase específica que serveix per declarar les propietats i métodes genérics dels taurons
 */

public class Tauro extends Especimen {

    /** Propietats */

    private int numeroEmbarcacions, numeroHam;
    private String tempsNavegacio, nubositat, ventDireccio, tipusHam, sexe;
    private float ventVelocitat;
    private boolean teParasits, teHam;

    /** Constructor */

    public Tauro(int temperaturaSuperficial, String especie, String habitat, float mida, Date tempsArribada,
                 int numeroEmbarcacions, int numeroHam, String tempsNavegacio, String nubositat, String ventDireccio,
                 String tipusHam, String sexe, float ventVelocitat, boolean teParasits, boolean teHam) {
        super( temperaturaSuperficial, especie, habitat, mida, tempsArribada);
        this.setNumeroEmbarcacions(numeroEmbarcacions);
        this.setTemperaturaSuperficial(temperaturaSuperficial);
        this.setNumeroHam(numeroHam);
        this.setTempsNavegacio(tempsNavegacio);
        this.setNubositat(nubositat);
        this.setVentDireccio(ventDireccio);
        this.setTipusHam(tipusHam);
        this.setSexe(sexe);
        this.setVentVelocitat(ventVelocitat);
        this.setTeParasits(teParasits);
        this.setTeHam(teHam);
    }

    /** Setters & getters */

    /** S&G > numeroEmbarcacions */

        /** Retorna el valor de el numero de embarcacions del tauro > @return int */
        public int getNumeroEmbarcacions() {
            return numeroEmbarcacions;
        }

        /** Assigna un valor al numero de embarcacions del tauro < @param numeroEmbarcacions */
        public void setNumeroEmbarcacions(int numeroEmbarcacions) {
            this.numeroEmbarcacions = numeroEmbarcacions;
        }

    /** S&G > numeroHam */

        /** Retorna el valor del numero d'hams del tauro > @return int */
        public int getNumeroHam() {
            return numeroHam;
        }

        /** Assigna un valor al numero d'hams del tauro < @param numeroHam */
        public void setNumeroHam(int numeroHam) {
            this.numeroHam = numeroHam;
        }

    /** S&G > tempsNavegacio */

        /** Retorna el valor del temps de navegacio de tauro > @return String */
        public String getTempsNavegacio() {
            return tempsNavegacio;
        }

        /** Assigna un valor al temps de navegacio del tauro < @param tempsNavegacio */
        public void setTempsNavegacio(String tempsNavegacio) {
            this.tempsNavegacio = tempsNavegacio;
        }

    /** S&G > nubositat */

        /** Retorna el valor de la nubositat de tauro > @return String */
        public String getNubositat() {
            return nubositat;
        }

        /** Assigna un valor al temps de navegacio del tauro < @param tempsNavegacio */
        public void setNubositat(String nubositat) {
            this.nubositat = nubositat;
        }

    /** S&G > ventDireccio */

        /** Retorna el valor de la direccio del vent de tauro > @return String */
        public String getventDireccio() {
            return ventDireccio;
        }

        /** Assigna un valor a la direccio del vent del tauro < @param tempsNavegacio */
        public void setVentDireccio(String ventDireccio) {
            this.ventDireccio = ventDireccio;
        }

    /** S&G > tipusHam */

        /** Retorna el valor del tipus d ham del tauro > @return String */
        public String getTipusHam() {
            return tipusHam;
        }

        /** Assigna un valor al tipus d ham del tauro < @param tempsNavegacio */
        public void setTipusHam(String tipusHam) {
            this.tipusHam = tipusHam;
        }

    /** S&G > sexe */

        /** Retorna el valor del sexe del tauro > @return String */
        public String getSexe() {
            return sexe;
        }

        /** Assigna un valor sexe del tauro < @param sexe */
        public void setSexe(String sexe) {
            this.sexe = sexe;
        }

    /** S&G > ventVelocitat */

        /** Retorna el valor del vent de la velocitat del tauro > @return float */
        public float getVentVelocitat() {
            return ventVelocitat;
        }

        /** Assigna un valor sobre el vent de la velocitat del tauro < @param ventVelocitat */
        public void setVentVelocitat(float ventVelocitat) {
            this.ventVelocitat = ventVelocitat;
        }

    /** S&G > teParasits */

        /** Retorna el valor sobre si te parasits el tauro > @return boolean */
        public boolean getTeParasits() {
            return teParasits;
        }

        /** Assigna un valor sobre si te un parasits el tauro < @param teParasits */
        public void setTeParasits(boolean teParasits) {
            this.teParasits = teParasits;
        }

    /** S&G > teHam */

        /** Retorna el valor sobre si te un ham el tauro > @return boolean */
        public boolean getTeHam() {
            return teHam;
        }

        /** Assigna un valor sobre si te un ham el tauro < @param teHam */
        public void setTeHam(boolean teHam) {
            this.teHam = teHam;
        }

}