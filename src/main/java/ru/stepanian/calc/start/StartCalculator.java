package ru.stepanian.calc.start;

import com.jtattoo.plaf.texture.TextureLookAndFeel;

import javax.swing.*;

/**
 * Created by 1 on 02.02.2016.
 */
public class StartCalculator {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {

        UIManager.setLookAndFeel(new TextureLookAndFeel());
        JFrame.setDefaultLookAndFeelDecorated(true);

        Launcher launcher = new Launcher();
        launcher.launch();
    }
}
















