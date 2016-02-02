package ru.stepanian.calc.components;

import javax.swing.*;
import java.awt.event.FocusListener;

/**
 * Created by 1 on 02.02.2016.
 */
public class MyField extends JTextField {

    private FocusListener focusListener;

    public void setActionListener(FocusListener focusListener) {
        this.focusListener = focusListener;
    }

    public void init() {
        this.addFocusListener(focusListener);
    }
}
