
import java.awt.FontFormatException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import ui.CluedoSkin;
import ui.MutedSkin;


/** The HypothesisPanel consists of a header panel, which contains a JLabel 
 * displaying the developing hypothesis, and a content JPanel, which at 
 * any time contains one of three subpanels: AccuseCharacter, AccuseRoom or 
 * AccuseWeapon. 
 * 
 * It has three fields to remember the user's selection of a guilty character,
 * room and weapon, and will be able to return these as a Set or List. 
 *
 * @author mckayvick
 */
public class HypothesisPanel extends javax.swing.JFrame {
    static final String ELLIPSIS = "...";
    static final String THEORY = " theorise that it was ";
    static final String ACCUSE = " accuse the villain ";
    static final String IN_THE = " in the ";
    static final String WITH_THE = " with the ";
    private String guiltyChar = "";
    private String guiltyRoom = "";
    private String guiltyWeap = "";
    private JPanel currentHypothesis;

    /**
     * Creates new form HypothesisPanel
     * @param room If the player is making a guess, let 'room' be the room 
     * in which they are making the accusation, as defined by Card.ROOMS. If they
     * are making a final accusation, let it be null. 
     */
    public HypothesisPanel(String room) {
        initComponents();
        doubleInit();
    }
    
    private void doubleInit() {
        /* will setup the currentHypothesis field with the required JPanel and
         display it.  */
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contents = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        headerText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout contentsLayout = new javax.swing.GroupLayout(contents);
        contents.setLayout(contentsLayout);
        contentsLayout.setHorizontalGroup(
            contentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentsLayout.setVerticalGroup(
            contentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        headerText.setText("jLabel1");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(headerText)
                .addGap(0, 468, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerText)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(HypothesisPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HypothesisPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HypothesisPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HypothesisPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HypothesisPanel(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contents;
    private javax.swing.JPanel header;
    private javax.swing.JLabel headerText;
    // End of variables declaration//GEN-END:variables


    /** ACCUSE CHARACTER FORM
     *
     *
     */
    public class AccuseCharacter extends javax.swing.JDialog {
        public AccuseCharacter(java.awt.Frame parent, boolean modal) {
            super(parent, modal);
            initComponents();
        }
        
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {
                buttonGroup1 = new javax.swing.ButtonGroup();
                scarlet = new javax.swing.JRadioButton();
                mustard = new javax.swing.JRadioButton();
                white = new javax.swing.JRadioButton();
                green = new javax.swing.JRadioButton();
                peacock = new javax.swing.JRadioButton();
                plum = new javax.swing.JRadioButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                buttonGroup1.add(scarlet);
                characterSet.add(scarlet);
                scarlet.setToolTipText(game.Card.SCARLET);

                buttonGroup1.add(mustard);
                characterSet.add(mustard);
                scarlet.setToolTipText(game.Card.MUSTARD);
                
                buttonGroup1.add(white);
                characterSet.add(white);
                scarlet.setToolTipText(game.Card.WHITE);

                buttonGroup1.add(green);
                characterSet.add(green);
                scarlet.setToolTipText(game.Card.GREEN);

                buttonGroup1.add(peacock);
                characterSet.add(peacock);
                scarlet.setToolTipText(game.Card.PEACOCK);

                buttonGroup1.add(plum);
                characterSet.add(plum);
                scarlet.setToolTipText(game.Card.PLUM);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scarlet)
                        .addGap(3, 3, 3)
                        .addComponent(mustard)
                        .addGap(3, 3, 3)
                        .addComponent(white))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(green)
                        .addGap(3, 3, 3)
                        .addComponent(peacock)
                        .addGap(3, 3, 3)
                        .addComponent(plum))
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scarlet, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mustard, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(white, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(green, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peacock, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plum, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                );

                for (JRadioButton b : characterSet) {
                    String nm = b.getToolTipText().toLowerCase();
                    b.setAlignmentX(0.5F);
                    b.setBorderPainted(true);
                    b.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/"+nm+"_s.png"))); // NOI18N
                    b.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/"+nm+".png"))); // NOI18N
                    b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    b.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/"+nm+".png"))); // NOI18N
                    b.setRolloverEnabled(false);
                    b.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/"+nm+".png"))); // NOI18N
                    b.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/"+nm+"_c.png"))); // NOI18N
                    b.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/"+nm+"t_c.png"))); // NOI18N
                }
                
                pack();
            }
//            java.awt.EventQueue.invokeLater(new Runnable() {
//                public void run() {
//                    AccuseCharacter dialog = new AccuseCharacter(new javax.swing.JFrame(), true);
//                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                        @Override
//                        public void windowClosing(java.awt.event.WindowEvent e) {
//                            System.exit(0);
//                        }
//                    });
//                    dialog.setVisible(true);
//                }
//            });

        private Set<JRadioButton> characterSet = new HashSet<>();
        // Variables declaration - do not modify                     
        private javax.swing.ButtonGroup buttonGroup1;
        private javax.swing.JRadioButton green;
        private javax.swing.JRadioButton mustard;
        private javax.swing.JRadioButton peacock;
        private javax.swing.JRadioButton plum;
        private javax.swing.JRadioButton scarlet;
        private javax.swing.JRadioButton white;
        // End of variables declaration 
        
    }
    
    /** ACCUSE WEAPON FORM 
     *
     *
     */
    public class AccuseWeapon extends javax.swing.JDialog {
        public AccuseWeapon(java.awt.Frame parent, boolean modal) {
            super(parent, modal);
            initComponents();
        }
        
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            weapons = new javax.swing.ButtonGroup();
            candlestick = new javax.swing.JRadioButton();
            dagger = new javax.swing.JRadioButton();
            revolver = new javax.swing.JRadioButton();
            rope = new javax.swing.JRadioButton();
            pipe = new javax.swing.JRadioButton();
            wrench = new javax.swing.JRadioButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            getContentPane().setLayout(new java.awt.GridLayout(2, 3, 3, 3));

            weapons.add(candlestick);
            candlestick.setText(game.Card.CANDLESTICK);
            weaponSet.add(candlestick);

            weapons.add(dagger);
            dagger.setText(game.Card.DAGGER);
            weaponSet.add(dagger);

            weapons.add(revolver);
            revolver.setText(game.Card.REVOLVER);
            weaponSet.add(revolver);

            weapons.add(rope);
            rope.setText(game.Card.ROPE);
            weaponSet.add(rope);

            weapons.add(pipe);
            pipe.setText(game.Card.PIPE);
            weaponSet.add(pipe);
            
            weapons.add(wrench);
            wrench.setText(game.Card.WRENCH);
            weaponSet.add(wrench);

            for (JRadioButton b : weaponSet) {
                b.setPreferredSize(null);
                b.setRolloverEnabled(false);
                getContentPane().add(b);
            }
            
            pack();
        }

        private Set<JRadioButton> weaponSet = new HashSet<JRadioButton>();
        // Variables declaration - do not modify                     
        private javax.swing.JRadioButton candlestick;
        private javax.swing.JRadioButton dagger;
        private javax.swing.JRadioButton pipe;
        private javax.swing.JRadioButton revolver;
        private javax.swing.JRadioButton rope;
        private javax.swing.ButtonGroup weapons;
        private javax.swing.JRadioButton wrench;
        // End of variables declaration                   
    }

    /** ACCUSE ROOM FORM 
     *
     *
     */
    public class AccuseRoom extends javax.swing.JDialog {
        public AccuseRoom(java.awt.Frame parent, boolean modal) {
            super(parent, modal);
            initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            rooms = new javax.swing.ButtonGroup();
            ballroom = new javax.swing.JRadioButton();
            billiard = new javax.swing.JRadioButton();
            conservatory = new javax.swing.JRadioButton();
            dining = new javax.swing.JRadioButton();
            hall = new javax.swing.JRadioButton();
            kitchen = new javax.swing.JRadioButton();
            lounge = new javax.swing.JRadioButton();
            study = new javax.swing.JRadioButton();
            library = new javax.swing.JRadioButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            getContentPane().setLayout(new java.awt.GridLayout(3, 3, 3, 3));

            rooms.add(ballroom);
            ballroom.setText(game.Card.BALL);
            roomSet.add(ballroom);

            rooms.add(billiard);
            billiard.setText(game.Card.BILLIARD);
            roomSet.add(billiard);

            rooms.add(conservatory);
            conservatory.setText(game.Card.CONSERVATORY);
            roomSet.add(conservatory);

            rooms.add(dining);
            dining.setText(game.Card.DINING);
            roomSet.add(dining);

            rooms.add(hall);
            hall.setText(game.Card.HALL);
            roomSet.add(hall);

            rooms.add(kitchen);
            kitchen.setText(game.Card.KITCHEN);
            roomSet.add(kitchen);

            rooms.add(lounge);
            lounge.setText(game.Card.LOUNGE);
            roomSet.add(lounge);

            rooms.add(study);
            study.setText(game.Card.STUDY);
            roomSet.add(study);

            rooms.add(library);
            library.setText(game.Card.LIBRARY);
            roomSet.add(library);

            for (JRadioButton b : roomSet) {
                b.setMinimumSize(new java.awt.Dimension(16, 30));
                b.setPreferredSize(null);
                b.setRolloverEnabled(false);
                getContentPane().add(b);
            }

            pack();
        }

        private Set<JRadioButton> roomSet = new HashSet<JRadioButton>();
        // Variables declaration - do not modify                     
        private javax.swing.JRadioButton ballroom;
        private javax.swing.JRadioButton billiard;
        private javax.swing.JRadioButton conservatory;
        private javax.swing.JRadioButton dining;
        private javax.swing.JRadioButton hall;
        private javax.swing.JRadioButton kitchen;
        private javax.swing.JRadioButton library;
        private javax.swing.JRadioButton lounge;
        private javax.swing.ButtonGroup rooms;
        private javax.swing.JRadioButton study;
        // End of variables declaration                   
    }
}