
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

    private final JButton buttonRed;
    private final JButton buttonYellow;
    private final JButton buttonGreen;

    public Window() {
        super("Window");
        setLayout(new FlowLayout());


        buttonRed = new JButton(String.valueOf(Lights.RED));
        add(buttonRed);
        buttonYellow = new JButton(String.valueOf(Lights.YELLOW));
        add(buttonYellow);
        buttonGreen = new JButton(String.valueOf(Lights.GREEN));
        add(buttonGreen);

        EventsHandler eventsHandler = new EventsHandler();
        buttonRed.addActionListener(eventsHandler);
        buttonYellow.addActionListener(eventsHandler);
        buttonGreen.addActionListener(eventsHandler);
    }

    public class EventsHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == buttonRed) {
                Filter.filterData(Lights.RED);
            } else if (event.getSource() == buttonYellow) {
                Filter.filterData(Lights.YELLOW);
            } else Filter.filterData(Lights.GREEN);
            JOptionPane.showMessageDialog(null, Filter.MESSAGE, "WARNING!" , Filter.TYPE);
        }
    }

}
