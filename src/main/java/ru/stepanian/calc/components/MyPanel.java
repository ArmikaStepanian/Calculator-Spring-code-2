package ru.stepanian.calc.components;

import javax.swing.*;
import java.awt.*;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 1 on 02.02.2016.
 */
public class MyPanel extends JPanel {

    private List panelComponents;

    public MyPanel(LayoutManager layout) {
        super(layout);
    }

    public void setPanelComponents(List panelComponents) {
        this.panelComponents = panelComponents;
    }

    public void init() {

        for (Iterator iter = panelComponents.iterator(); iter.hasNext();) {
            Component component = (Component) iter.next();
            add(component);
        }
    }
}
