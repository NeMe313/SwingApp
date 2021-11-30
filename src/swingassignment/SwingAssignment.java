package swingassignment;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;


public class SwingAssignment {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

        UIManager.setLookAndFeel(new MetalLookAndFeel());
        
        MainFrame settings = new MainFrame();

        int choiceDialog = JOptionPane.showOptionDialog(null, "Choose an option", "Option dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Settings", "Close"}, null);

        switch (choiceDialog) {
            case JOptionPane.YES_OPTION:
                settings.setVisible(true);
                break;
            case JOptionPane.NO_OPTION:
                System.exit(0);
             
        }

    }

}
