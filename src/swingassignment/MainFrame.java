package swingassignment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MainFrame extends javax.swing.JFrame {

    private boolean blink = false;
    private Color colorChosen;
    JFrame blinkFrame = new JFrame();

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        onTimeRbtn = new javax.swing.JRadioButton();
        countRbtn = new javax.swing.JRadioButton();
        chooseColBtn = new javax.swing.JButton();
        chooseColLbl = new javax.swing.JLabel();
        speedLbl = new javax.swing.JLabel();
        speedCombo = new javax.swing.JComboBox<>();
        stopBtn = new javax.swing.JButton();
        startBtn = new javax.swing.JButton();
        onTimeFField = new javax.swing.JFormattedTextField();
        countdownFField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup2.add(onTimeRbtn);
        onTimeRbtn.setText("on time:");

        buttonGroup2.add(countRbtn);
        countRbtn.setText("countdown(seconds)");

        chooseColBtn.setText("Choose color");
        chooseColBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseColBtnActionPerformed(evt);
            }
        });

        chooseColLbl.setText("No color chosen");

        speedLbl.setText("Speed:");

        speedCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        stopBtn.setText("Stop");
        stopBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopBtnActionPerformed(evt);
            }
        });

        startBtn.setText("Start");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        try {
            onTimeFField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        countdownFField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(speedCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedLbl))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(onTimeRbtn)
                                    .addComponent(countRbtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(onTimeFField, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(countdownFField)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chooseColBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(chooseColLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 10, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(stopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)))))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onTimeRbtn)
                    .addComponent(onTimeFField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countRbtn)
                    .addComponent(countdownFField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseColBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseColLbl))
                .addGap(36, 36, 36)
                .addComponent(speedLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(speedCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stopBtn)
                    .addComponent(startBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseColBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseColBtnActionPerformed

        JColorChooser cChooser = new JColorChooser();

        JDialog dialog = JColorChooser.createDialog(null, "Choose color", true, cChooser, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorChosen = cChooser.getColor();
                chooseColLbl.setForeground(colorChosen);
                int green = colorChosen.getGreen();
                int red = colorChosen.getRed();
                int blue = colorChosen.getBlue();
                chooseColLbl.setText("rgb" + "(" + red + ", " + green + ", " + blue + ")");
            }
        }, null);
        dialog.setVisible(true);

    }//GEN-LAST:event_chooseColBtnActionPerformed

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed

        String time;
        Long millis = 0L;
        Calendar current = GregorianCalendar.getInstance();
        boolean canRun =false;
        if (onTimeRbtn.isSelected()) {
            if (onTimeFField.getText().equals("  :  :  ")) {
                JOptionPane.showMessageDialog(null, "Please select the time of activation.");
            } else {
                canRun =true;
                time = onTimeFField.getText();
                String[] timeArray = time.split(":");
                String hours = timeArray[0];
                String minutes = timeArray[1];
                String seconds = timeArray[2];

                Calendar userSet = GregorianCalendar.getInstance();

                userSet.set(Calendar.HOUR_OF_DAY, Integer.parseInt(hours));
                userSet.set(Calendar.MINUTE, Integer.parseInt(minutes));
                userSet.set(Calendar.SECOND, Integer.parseInt(seconds));

                millis = userSet.getTimeInMillis() - current.getTimeInMillis();
            }
        } else if (countRbtn.isSelected()) {
            if (countdownFField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please select the time of activation.");
            } else {
        canRun = true;
                time = countdownFField.getText();
                millis = Long.parseLong(time) * 1000;
            }
        }

        if (millis < 0) {

            JOptionPane.showMessageDialog(null, "Please choose a time in the future!");
            return;
        }

        if (!countRbtn.isSelected() && !onTimeRbtn.isSelected()) {

            JOptionPane.showMessageDialog(null, "Please select the mode of activation.");

        } else {

            if (canRun) {

                Timer windowShowTime = new Timer(millis.intValue(), (ActionEvent e) -> {
                    String bs = speedCombo.getSelectedItem().toString();
                    int timerBS = Integer.parseInt(bs) * 1000;

                    blinkFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    blinkFrame.setLayout(new BorderLayout());
                    blinkFrame.setPreferredSize(new Dimension(300, 300));

                    JPanel bp = new JPanel();
                    bp.setSize(new Dimension(300, 300));

                    Color defaultColor = bp.getBackground();

                    blinkFrame.add(bp);
                    blinkFrame.pack();
                    blinkFrame.setLocationRelativeTo(null);
                    blinkFrame.setVisible(true);

                    Timer blinkTime = new Timer(timerBS, (ActionEvent e1) -> {
                        blink = !blink;
                        if (blink) {

                            bp.setBackground(colorChosen);

                        } else {

                            bp.setBackground(defaultColor);
                        }
                    });

                    blinkTime.setRepeats(true);
                    blinkTime.start();

                    blinkFrame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                    blinkFrame.setPreferredSize(new Dimension(300, 300));

                    blinkFrame.setLocationRelativeTo(null);
                    blinkFrame.setVisible(true);
                });

                blinkFrame.setUndecorated(true);
                windowShowTime.start();
                windowShowTime.setRepeats(false);

                countRbtn.setEnabled(false);
                onTimeRbtn.setEnabled(false);
                countdownFField.setEnabled(false);
                chooseColBtn.setEnabled(false);
                speedLbl.setEnabled(false);
                speedCombo.setEnabled(false);
                startBtn.setEnabled(false);
                onTimeFField.setEnabled(false);

            }
        }
    }//GEN-LAST:event_startBtnActionPerformed

    private void stopBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopBtnActionPerformed
        blinkFrame.dispose();
        countRbtn.setEnabled(true);
        onTimeRbtn.setEnabled(true);
        countdownFField.setEnabled(true);
        chooseColBtn.setEnabled(true);
        speedLbl.setEnabled(true);
        speedCombo.setEnabled(true);
        startBtn.setEnabled(true);
        onTimeFField.setEnabled(true);
    }//GEN-LAST:event_stopBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton chooseColBtn;
    private javax.swing.JLabel chooseColLbl;
    private javax.swing.JRadioButton countRbtn;
    private javax.swing.JFormattedTextField countdownFField;
    private javax.swing.JFormattedTextField onTimeFField;
    private javax.swing.JRadioButton onTimeRbtn;
    private javax.swing.JComboBox<String> speedCombo;
    private javax.swing.JLabel speedLbl;
    private javax.swing.JButton startBtn;
    private javax.swing.JButton stopBtn;
    // End of variables declaration//GEN-END:variables

}
