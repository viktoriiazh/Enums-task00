
import model.Lights;
import utils.Filter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Window extends JFrame {
    private final JButton buttonRed;
    private final JButton buttonYellow;
    private final JButton buttonGreen;
    JPanel panelNorth;
    JPanel panelWest;
    JPanel panelCenter;
    JPanel panelEast;
    JLabel label;

    public Window() {
        super("Selection window");
        setLayout(new BorderLayout());

        String LABEL_TEXT = "What color traffic lights do you see?";
        label = new JLabel(LABEL_TEXT);
        panelNorth = new JPanel();
        getContentPane().add(panelNorth, BorderLayout.NORTH);
        panelNorth.add(label);

        buttonRed = new JButton(String.valueOf(Lights.RED));
        panelWest = new JPanel();
        getContentPane().add(panelWest, BorderLayout.WEST);
        panelWest.add(buttonRed);

        buttonYellow = new JButton(String.valueOf(Lights.YELLOW));
        panelCenter = new JPanel();
        getContentPane().add(panelCenter, BorderLayout.CENTER);
        panelCenter.add(buttonYellow);

        buttonGreen = new JButton(String.valueOf(Lights.GREEN));
        panelEast = new JPanel();
        getContentPane().add(panelEast, BorderLayout.EAST);
        panelEast.add(buttonGreen);

        EventsHandler eventsHandler = new EventsHandler();
        buttonRed.addActionListener(eventsHandler);
        buttonYellow.addActionListener(eventsHandler);
        buttonGreen.addActionListener(eventsHandler);

        EventsMouseHandler eventsMouseHandler = new EventsMouseHandler();
        buttonRed.addMouseListener(eventsMouseHandler);
        buttonYellow.addMouseListener(eventsMouseHandler);
        buttonGreen.addMouseListener(eventsMouseHandler);

    }

    public class EventsHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String TITLE = "WARNING!";

            if (event.getSource() == buttonRed) {
                Filter.filterData(Lights.RED);
            } else if (event.getSource() == buttonYellow) {
                Filter.filterData(Lights.YELLOW);
            } else Filter.filterData(Lights.GREEN);
            JOptionPane.showMessageDialog(null, Filter.MESSAGE, TITLE, Filter.TYPE);
        }
    }

    public class EventsMouseHandler implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            buttonRed.setBackground(null);
            buttonYellow.setBackground(null);
            buttonGreen.setBackground(null);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if (e.getSource() == buttonRed) {
                buttonRed.setBackground(Color.RED);
            } else if (e.getSource() == buttonYellow) {
                buttonYellow.setBackground(Color.YELLOW);
            } else buttonGreen.setBackground(Color.GREEN);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            buttonRed.setBackground(null);
            buttonYellow.setBackground(null);
            buttonGreen.setBackground(null);
        }
    }

}
