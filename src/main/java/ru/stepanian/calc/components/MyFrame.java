package ru.stepanian.calc.components;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 1 on 02.02.2016.
 */
public class MyFrame extends JFrame {

    public MyFrame() throws HeadlessException {
    }

    public MyFrame(String title, int width, int height) {
        super(title);
        this.setSize(width, height);
    }
    public void init() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }




}
