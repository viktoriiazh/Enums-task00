import javax.swing.*;

public class Filter {
    public static int TYPE;
    Lights lights;
    public static String MESSAGE;

    public static void filterData(Lights lights) {

        switch (lights) {
            case RED -> {
              TYPE = JOptionPane.ERROR_MESSAGE;
                lights = Lights.RED;
              MESSAGE = lights.getLights();
            }
            case YELLOW -> {
               TYPE = JOptionPane.WARNING_MESSAGE;
                lights = Lights.YELLOW;
                MESSAGE = lights.getLights();
            }
            case GREEN -> {
                TYPE = JOptionPane.INFORMATION_MESSAGE;
                lights = Lights.GREEN;
                MESSAGE = lights.getLights();
            }
            default -> System.exit(0);
        }


    }
}
