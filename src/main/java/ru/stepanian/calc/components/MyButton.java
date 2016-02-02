package ru.stepanian.calc.components;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by 1 on 02.02.2016.
 */
public class MyButton extends JButton {

    private ActionListener actionListener;

    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public void init() {
        this.addActionListener(actionListener);
    }

}
