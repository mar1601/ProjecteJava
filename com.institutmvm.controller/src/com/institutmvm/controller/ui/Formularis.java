package com.institutmvm.controller.ui;
import javax.swing.*;
import java.sql.*;
import com.institutmvm.aplication.entities.Tauro;
import com.institutmvm.aplication.entities.Crustasi;
import com.institutmvm.aplication.entities.Alga;
//HACER CADA FORMULARIO Y CONECTAR CON SQL

public class Formularis {
    private static JRadioButton radio_pro1, radio_pro2;
    private static JRadioButton radio_par1, radio_par2;
    private static JRadioButton radio_ham1, radio_ham2;
    private static boolean proshark, parasits, precenciaHams;
    private static JTextField especie = new JTextField();
    private static JTextField habitat = new JTextField();
    private static JTextField tempsNavegacio = new JTextField();
    private static JTextField genere = new JTextField();
    private static JTextField horaArribada = new JTextField();
    private static JTextField mida = new JTextField();
    private static JTextField vent = new JTextField();
    private static JTextField nubositat = new JTextField();
    private static JTextField direccioVent = new JTextField();
    private static Values values = new Values();

    /** Genera el formulari amb les dades comunes a totes les especies **/

    public static JPanel BaseFrom(int rows, int cols) {
        JPanel panel2 = new JPanel(new GridLayout(rows, cols));

        panel2.add(new JLabel("Especie"));
        panel2.add(especie);

        panel2.add(new JLabel("Habitat"));
        panel2.add(habitat);

        panel2.add(new JLabel("Temps de navegacio"));
        panel2.add(tempsNavegacio);

        panel2.add(new JLabel("Genere"));
        panel2.add(genere);

        panel2.add(new JLabel("Hora d'arribada"));
        panel2.add(horaArribada);

        panel2.add(new JLabel("mida"));
        panel2.add(mida);

        panel2.add(new JLabel("Vent"));
        panel2.add(vent);

        panel2.add(new JLabel("Nubositat"));
        panel2.add(nubositat);

        panel2.add(new JLabel("Direccio vent"));
        panel2.add(direccioVent);

        return panel2;
    }

    /**
     * Genera el formulari especific per la classe Cartilaginos
     */
    public static void CartilaginosForm() {

        JPanel panel2 = BaseFrom(20, 2);

        panel2.add(new JLabel("Profunditat"));
        JTextField profunditat = new JTextField();

        panel2.add(profunditat);

        panel2.add(new JLabel("Temperatura superficial"));
        JTextField temperaturaSuperficial = new JTextField();

        panel2.add(temperaturaSuperficial);

        panel2.add(new JLabel("Embarcacions"));
        JTextField embarcacions = new JTextField();
        panel2.add(embarcacions);

        panel2.add(new JLabel("Tipus esquer"));
        JTextField tipusEsquer = new JTextField();
        panel2.add(tipusEsquer);

        panel2.add(new JLabel("Proshark"));

        panel2.add(Box.createRigidArea(new Dimension(5, 0)));

        radio_pro1 = new JRadioButton("Si");
        radio_pro2 = new JRadioButton("No");

        radio_pro1.addChangeListener(l -> {
            if (radio_pro1.isSelected()) {
                radio_pro2.setSelected(false);
            }
        });
        panel2.add(radio_pro1);

        radio_pro2.addChangeListener(l -> {
            if (radio_pro2.isSelected()) {
                radio_pro1.setSelected(false);
            }
        });
        panel2.add(radio_pro2);

        panel2.add(new JLabel("Parasits"));
        panel2.add(Box.createRigidArea(new Dimension(5, 0)));

        radio_par1 = new JRadioButton("Si");
        radio_par2 = new JRadioButton("No");

        radio_par1.addChangeListener(l -> {
            if (radio_par1.isSelected()) {
                radio_par2.setSelected(false);
            }
        });
        panel2.add(radio_par1);

        radio_par2.addChangeListener(l -> {
            if (radio_par2.isSelected()) {
                radio_par1.setSelected(false);
            }
        });
        panel2.add(radio_par2);

        panel2.add(new JLabel("Precencia hams"));

        panel2.add(Box.createRigidArea(new Dimension(5, 0)));

        radio_ham1 = new JRadioButton("Si");
        radio_ham2 = new JRadioButton("No");

        panel2.add(radio_ham1);

        panel2.add(radio_ham2);

        panel2.add(new JLabel("Numero de hams"));
        JTextField numHams = new JTextField();
        numHams.setEnabled(false);

        radio_ham1.addChangeListener(l -> {
            if (radio_ham1.isSelected()) {
                numHams.setText("");
                numHams.setEnabled(true);
                radio_ham2.setSelected(false);
            }
        });
        radio_ham2.addChangeListener(l -> {
            if (radio_ham2.isSelected()) {
                numHams.setEnabled(false);
                numHams.setText("0");
                radio_ham1.setSelected(false);
            }
        });
        panel2.add(numHams);

        int result3 = JOptionPane.showConfirmDialog(null, panel2, "Cartilaginos",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result3 == JOptionPane.OK_OPTION) {
            if (especie.getText().isEmpty() || habitat.getText().isEmpty() || tempsNavegacio.getText().isEmpty()
                    || genere.getText().isEmpty() || horaArribada.getText().isEmpty() || mida.getText().isEmpty()
                    || vent.getText().isEmpty() || nubositat.getText().isEmpty() || direccioVent.getText().isEmpty()
                    || profunditat.getText().isEmpty() || temperaturaSuperficial.getText().isEmpty()
                    || embarcacions.getText().isEmpty() || tipusEsquer.getText().isEmpty()
                    || numHams.getText().isEmpty() && (radio_pro1.isSelected() || radio_pro2.isSelected())
                    && (radio_par1.isSelected() || radio_par2.isSelected()) && (radio_ham1.isSelected()
                    || radio_ham2.isSelected())) {
                JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Error",
                        JOptionPane.ERROR_MESSAGE);
                CartilaginosForm();

            } else {

                if (values.isFloat(mida.getText()) && values.isInt(profunditat.getText()) && values.isInt(temperaturaSuperficial.getText())
                        && values.isInt(embarcacions.getText()) && values.isInt(numHams.getText())) {

                    proshark = radio_pro1.isSelected();
                    parasits = radio_par1.isSelected();
                    precenciaHams = radio_ham1.isSelected();

                    Cartilaginos cartilaginosos = new Cartilaginos(especie.getText(), habitat.getText(),
                            tempsNavegacio.getText(), genere.getText(), horaArribada.getText(),
                            Float.parseFloat(mida.getText()), vent.getText(), nubositat.getText(),
                            direccioVent.getText(),
                            Integer.parseInt(profunditat.getText()), Integer.parseInt(temperaturaSuperficial.getText()),
                            Integer.parseInt(embarcacions.getText()), tipusEsquer.getText(),
                            proshark, parasits, precenciaHams, Integer.parseInt(numHams.getText()));

                    InsertSQL insertSQL = new InsertSQL();

                    insertSQL.insertSQL(cartilaginosos);
                } else {
                    JOptionPane.showMessageDialog(null, "Los campos no coinciden con los tipos", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    CartilaginosForm();
                }
            }

        } else {
            System.out.println("Cancel");
        }
    }

    /**
     * Genera el formulari especific per la classe Alga
     */
    public static void AlgaForm() {

        JPanel panel2 = BaseFrom(11, 3);

        panel2.add(new JLabel("Profunditat"));
        JTextField profunditat = new JTextField();
        panel2.add(profunditat);

        panel2.add(new JLabel("Temperatura superficial"));
        JTextField temperaturaSuperficial = new JTextField();
        panel2.add(temperaturaSuperficial);

        int result3 = JOptionPane.showConfirmDialog(null, panel2, "Alga",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result3 == JOptionPane.OK_OPTION) {
            if (especie.getText().isEmpty() || habitat.getText().isEmpty() || tempsNavegacio.getText().isEmpty()
                    || genere.getText().isEmpty() || horaArribada.getText().isEmpty() || mida.getText().isEmpty()
                    || vent.getText().isEmpty() || nubositat.getText().isEmpty() || direccioVent.getText().isEmpty()
                    || profunditat.getText().isEmpty() || temperaturaSuperficial.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Error",
                        JOptionPane.ERROR_MESSAGE);
                AlgaForm();
            } else {
                if (values.isFloat(mida.getText()) && values.isInt(profunditat.getText())
                        && values.isInt(temperaturaSuperficial.getText())) {
                    Alga alga = new Alga(color.getText(), habitat.getText(), tempsNavegacio.getText(),
                            genere.getText(), horaArribada.getText(), Float.parseFloat(mida.getText()),
                            vent.getText(), nubositat.getText(), direccioVent.getText(),
                            Integer.parseInt(profunditat.getText()),
                            Integer.parseInt(temperaturaSuperficial.getText()));

                    // String especie, String habitat, float mida, Date tempsArribada,
                    //                 int temperaturaSuperficial, String color

                    InsertSQL insertSQL = new InsertSQL();

                    insertSQL.insertSQL(alga);
                } else {
                    JOptionPane.showMessageDialog(null, "Los campos no coinciden con los tipos", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    AlgaForm();
                }
            }
        } else {
            System.out.println("Cancel");
        }
    }

    /**
     * Genera el formulari especific per la classe Molusc
     */
    public static void MoluscForm() {

        JPanel panel2 = BaseFrom(14, 3);

        panel2.add(new JLabel("Profunditat"));
        JTextField profunditat = new JTextField();
        panel2.add(profunditat);

        panel2.add(new JLabel("Temperatura superficial"));
        JTextField temperaturaSuperficial = new JTextField();
        panel2.add(temperaturaSuperficial);

        panel2.add(new JLabel("Embarcacions"));
        JTextField embarcacions = new JTextField();
        panel2.add(embarcacions);

        panel2.add(new JLabel("Parasits"));
        panel2.add(Box.createRigidArea(new Dimension(5, 0)));
