package utils;

import model.Lights;

import javax.swing.*;

public class Filter {
    public static int TYPE;
    public static String MESSAGE;

    public static void filterData(Lights lights) {

        switch (lights) {
            case RED -> {
                TYPE = JOptionPane.ERROR_MESSAGE;
                MESSAGE = lights.getLights();
            }
            case YELLOW -> {
                TYPE = JOptionPane.WARNING_MESSAGE;
                MESSAGE = lights.getLights();
            }
            case GREEN -> {
                TYPE = JOptionPane.INFORMATION_MESSAGE;
                MESSAGE = lights.getLights();
            }
            default -> System.exit(0);
        }
    }
}
