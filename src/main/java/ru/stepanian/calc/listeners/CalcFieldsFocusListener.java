package ru.stepanian.calc.listeners;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Created by 1 on 02.02.2016.
 */
public class CalcFieldsFocusListener implements FocusListener {

    public static final String INPUT_NUMBER = "add number";

    private JTextField field;

    public CalcFieldsFocusListener() {
    }

    public CalcFieldsFocusListener(JTextField field) {
        this.field = field;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (field.getText().equals(INPUT_NUMBER)) {
            field.setText("");
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (field.getText().equals("")) {
            field.setText(INPUT_NUMBER);
        }
    }
}
