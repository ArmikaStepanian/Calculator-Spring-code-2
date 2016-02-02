package ru.stepanian.calc.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 1 on 02.02.2016.
 */
public class Launcher {

    public void launch() {

        String[] contextPaths = new String[] {"spring-config-frame.xml"};
        new ClassPathXmlApplicationContext(contextPaths);
    }
}