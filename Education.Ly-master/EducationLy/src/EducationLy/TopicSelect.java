/**
Author: Tirth Nagar
Date: 7/12/2020
Purpose: To create the JFrame form that will ask the user what unit they would like to learn
 */

package EducationLy;

//Import nessaccary packages
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;

public class TopicSelect extends javax.swing.JFrame {

    //Creates new form TopicSelect and all of its components
    public TopicSelect() {
        initComponents();
        SetIcon();
        jScrollPane1.setBorder(null);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;

        // Move the window
        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RootWindow = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        Unit1 = new javax.swing.JLabel();
        Unit2 = new javax.swing.JLabel();
        Unit3 = new javax.swing.JLabel();
        Unit4 = new javax.swing.JLabel();
        Unit5 = new javax.swing.JLabel();
        FactPrompt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Fact = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Exit = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        HowToUse = new javax.swing.JMenuItem();
        AboutUs = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Education.Ly");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(550, 500));

        RootWindow.setBackground(java.awt.Color.white);
        RootWindow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        title.setText("Units");

        Unit1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Unit1.setText("1. Biological Diversity");

        Unit2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Unit2.setText("2. Matter and Chemical Change");
        Unit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Unit2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Unit2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Unit2MouseExited(evt);
            }
        });

        Unit3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Unit3.setText("3. Environmental Chemistry");

        Unit4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Unit4.setText("4. Electrical Principles and Technologies");

        Unit5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Unit5.setText("5. Space Exploration");

        FactPrompt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FactPrompt.setText("Did you know?");

        Fact.setEditable(false);
        Fact.setColumns(20);
        Fact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Fact.setLineWrap(true);
        Fact.setRows(5);
        String fact1 = "Babies have around 100 more bones than adults.";
        String fact2 = "The Eiffel Tower can be 15 cm taller during the summer.";
        String fact3 = "20% of Earth’s oxygen is produced by the Amazon rainforest.";
        String fact4 = "Some metals are so reactive that they explode on contact with water.";
        String fact5 = "A teaspoonful of neutron star would weigh 6 billion tons.";
        String fact6 = "Hawaii moves 7.5cm closer to Alaska every year.";
        String fact7 = "Chalk is made from trillions of microscopic plankton fossils.";
        String fact8 = "Polar bears are nearly undetectable by infrared cameras.";
        String fact9 = "It takes 8 minutes, 19 seconds for light to travel from the Sun to the Earth.";
        String fact10 = "Stomach acid is strong enough to dissolve stainless steel.";
        String fact11 = "If you took out all the empty space in our atoms, the human race could fit in the volume of a sugar cube.";
        String fact12 = "A flea can accelerate faster than the Space Shuttle.";

        String[] facts = {fact1,fact2,fact3,fact4,fact5,fact6,fact7,fact8,fact9,fact10,fact11,fact12};
        Random random = new Random();
        int index = random.nextInt(facts.length);
        Fact.setText(""+facts[index]);
        Fact.setWrapStyleWord(true);
        Fact.setBorder(null);
        Fact.setDisabledTextColor(java.awt.Color.white);
        Fact.setSelectionColor(java.awt.Color.white);
        jScrollPane1.setViewportView(Fact);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EducationLy/images/back.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout RootWindowLayout = new javax.swing.GroupLayout(RootWindow);
        RootWindow.setLayout(RootWindowLayout);
        RootWindowLayout.setHorizontalGroup(
            RootWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RootWindowLayout.createSequentialGroup()
                .addGroup(RootWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RootWindowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(157, 157, 157)
                        .addComponent(title))
                    .addGroup(RootWindowLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(RootWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Unit2)
                            .addComponent(Unit1)
                            .addComponent(Unit3)
                            .addComponent(Unit4)
                            .addComponent(Unit5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RootWindowLayout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addGroup(RootWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RootWindowLayout.createSequentialGroup()
                        .addComponent(FactPrompt)
                        .addGap(222, 222, 222))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RootWindowLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        RootWindowLayout.setVerticalGroup(
            RootWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RootWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RootWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Unit1)
                .addGap(18, 18, 18)
                .addComponent(Unit2)
                .addGap(18, 18, 18)
                .addComponent(Unit3)
                .addGap(18, 18, 18)
                .addComponent(Unit4)
                .addGap(18, 18, 18)
                .addComponent(Unit5)
                .addGap(32, 32, 32)
                .addComponent(FactPrompt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        File.setText("File");

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        File.add(Exit);

        menuBar.add(File);

        Help.setText("Help");

        HowToUse.setText("How To Use");
        HowToUse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HowToUseActionPerformed(evt);
            }
        });
        Help.add(HowToUse);

        menuBar.add(Help);

        AboutUs.setText("About Us");
        AboutUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutUsMouseClicked(evt);
            }
        });
        menuBar.add(AboutUs);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RootWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RootWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //If you close the program terminate it completely
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    //When the How to use menu item is clicked teach the user how to use the program
    private void HowToUseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HowToUseActionPerformed
        javax.swing.JOptionPane.showMessageDialog(this,"1. Choose Your Grade\n2. Select Your Subject\n3. Choose the Topic You Want to Learn");
    }//GEN-LAST:event_HowToUseActionPerformed
    
    //When the about us tab on the menu bar is clicked tell the ueser about the purpose of the program and who made it
    private void AboutUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this,"This GUI application is made by Tirth Nagar using Jframe.\nIts purpose is to help educate students in our community.");
    }//GEN-LAST:event_AboutUsMouseClicked
    
    //When you hover over the second unit change its text color to red
    private void Unit2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Unit2MouseEntered
        Unit2.setForeground(Color.RED);
    }//GEN-LAST:event_Unit2MouseEntered

    //When you stop hovering over the first lesson change its text color back to normal
    private void Unit2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Unit2MouseExited
        Unit2.setForeground(Color.BLACK);
    }//GEN-LAST:event_Unit2MouseExited

    //When the second unit is clicked make the current frame invisible and set the LessonSelect frame visible
    private void Unit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Unit2MouseClicked
        new LessonSelect().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Unit2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new SubjectSelect().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(TopicSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TopicSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TopicSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TopicSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TopicSelect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AboutUs;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JTextArea Fact;
    private javax.swing.JLabel FactPrompt;
    private javax.swing.JMenu File;
    private javax.swing.JMenu Help;
    private javax.swing.JMenuItem HowToUse;
    private javax.swing.JPanel RootWindow;
    private javax.swing.JLabel Unit1;
    private javax.swing.JLabel Unit2;
    private javax.swing.JLabel Unit3;
    private javax.swing.JLabel Unit4;
    private javax.swing.JLabel Unit5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
    
    //Set the icon for the JFrame form
    private void SetIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images//study.png")));
    }
}