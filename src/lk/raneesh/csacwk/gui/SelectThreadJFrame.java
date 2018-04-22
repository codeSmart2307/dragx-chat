/**
 * File Name: SelectThreadJFrame.java
 */

package lk.raneesh.csacwk.gui;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import lk.raneesh.csacwk.controllers.ChatController;
import lk.raneesh.csacwk.datastructure.RefreshThreads;
import lk.raneesh.csacwk.datastructure.ThreadList;
import lk.raneesh.csacwk.datastructure.User;
import lk.raneesh.csacwk.gui.customlist.ThreadPanel;

public class SelectThreadJFrame extends javax.swing.JFrame {

    private AddThreadJFrame addThread;
    private EditMessagesJFrame editMessages;
    private LoginJFrame login;   
    private RefreshThreads autoRefreshThreads;
    private Thread threadsRefreshThread;

    public static DefaultListModel<ThreadList> threadListModel = new DefaultListModel<>();

    /**
     * Creates new form LoginJFrame
     */
    public SelectThreadJFrame() {
        super("DRAGx Chat | Select Thread");
        initComponents();
        generateThreadList();       
        generateUserGreeting();
        //retrieveThreads();
        runAutoRefresh();
    }

    public void generateThreadList() {
        threadJList.setModel(threadListModel);
        threadJList.setCellRenderer(new ThreadPanel());
    }

    public void generateUserGreeting() {
        this.userGreetingLabel.setText("Welcome, " + User.getCurrUser().getNickname() + "!");
    }   

    public void runAutoRefresh() {
       autoRefreshThreads = new RefreshThreads(); 
       threadsRefreshThread = new Thread(autoRefreshThreads);
       threadsRefreshThread.start();
    }
    
    public void retrieveThreads() {
        threadListModel.removeAllElements();
        ArrayList<ThreadList> currentThreadsList = ChatController.retrieveAllThreads();
        
        for (int i = 0; i < currentThreadsList.size(); i++) {
            threadListModel.addElement(new ThreadList(currentThreadsList.get(i).getThreadId(), currentThreadsList.get(i).getThreadTitle(), currentThreadsList.get(i).getThreadCreator(), currentThreadsList.get(i).getThreadDate()));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectThreadsPanel = new javax.swing.JPanel();
        selectThreadHeaderLabel = new javax.swing.JLabel();
        addThreadButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        chatHeaderLabel = new javax.swing.JLabel();
        selectThreadsScrollPane = new javax.swing.JScrollPane();
        threadJList = new javax.swing.JList<>();
        refreshButton = new javax.swing.JButton();
        userGreetingLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selectThreadsPanel.setBackground(new java.awt.Color(0, 0, 0));

        selectThreadHeaderLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        selectThreadHeaderLabel.setForeground(new java.awt.Color(255, 255, 255));
        selectThreadHeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectThreadHeaderLabel.setText("Select Thread");
        selectThreadHeaderLabel.setToolTipText("");

        addThreadButton.setBackground(new java.awt.Color(153, 153, 0));
        addThreadButton.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        addThreadButton.setForeground(new java.awt.Color(255, 255, 255));
        addThreadButton.setText("ADD NEW");
        addThreadButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addThreadButton.setBorderPainted(false);
        addThreadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addThreadButtonActionPerformed(evt);
            }
        });

        logOutButton.setBackground(new java.awt.Color(255, 0, 51));
        logOutButton.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(255, 255, 255));
        logOutButton.setText("LOG OUT");
        logOutButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logOutButton.setBorderPainted(false);
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        chatHeaderLabel.setFont(new java.awt.Font("Roboto Black", 0, 100)); // NOI18N
        chatHeaderLabel.setForeground(new java.awt.Color(153, 153, 0));
        chatHeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chatHeaderLabel.setText("DRAGx Chat");
        chatHeaderLabel.setToolTipText("");
        chatHeaderLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        threadJList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                threadJListMouseClicked(evt);
            }
        });
        selectThreadsScrollPane.setViewportView(threadJList);

        refreshButton.setBackground(new java.awt.Color(0, 51, 51));
        refreshButton.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        userGreetingLabel.setBackground(new java.awt.Color(0, 0, 0));
        userGreetingLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        userGreetingLabel.setForeground(new java.awt.Color(255, 255, 255));
        userGreetingLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userGreetingLabel.setText("Welcome, ");

        javax.swing.GroupLayout selectThreadsPanelLayout = new javax.swing.GroupLayout(selectThreadsPanel);
        selectThreadsPanel.setLayout(selectThreadsPanelLayout);
        selectThreadsPanelLayout.setHorizontalGroup(
            selectThreadsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectThreadsPanelLayout.createSequentialGroup()
                .addGroup(selectThreadsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectThreadsPanelLayout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(addThreadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(selectThreadsPanelLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(selectThreadsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(selectThreadsPanelLayout.createSequentialGroup()
                                .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(22, 22, 22)
                                .addComponent(selectThreadHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(selectThreadsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(selectThreadsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(userGreetingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chatHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        selectThreadsPanelLayout.setVerticalGroup(
            selectThreadsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectThreadsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userGreetingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chatHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(selectThreadsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectThreadHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(selectThreadsPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(logOutButton))
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(selectThreadsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(addThreadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selectThreadsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selectThreadsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addThreadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addThreadButtonActionPerformed
        addThread = new AddThreadJFrame();
        addThread.setVisible(true);
    }//GEN-LAST:event_addThreadButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        User.setCurrUser(null); //Sets current signed in user to null

        //Closes Select Threads window and opens Login Window
        login = new LoginJFrame();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void threadJListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threadJListMouseClicked
        int threadId = 0;
        JList threadJList = (JList) evt.getSource();
        if (evt.getButton() == MouseEvent.BUTTON1) {
            if (evt.getClickCount() == 2) {
                //Detecting double click event                
                threadId = Integer.parseInt(threadJList.getSelectedValue().toString());
                System.out.println("Thread Id: " + threadId);
                EditMessagesJFrame.setThreadId(threadId);
                editMessages = new EditMessagesJFrame(threadId);
                editMessages.setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_threadJListMouseClicked

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        retrieveThreads();
    }//GEN-LAST:event_refreshButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SelectThreadJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectThreadJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectThreadJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectThreadJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectThreadJFrame().setVisible(true);                
            }
        });       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addThreadButton;
    private javax.swing.JLabel chatHeaderLabel;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JLabel selectThreadHeaderLabel;
    private javax.swing.JPanel selectThreadsPanel;
    private javax.swing.JScrollPane selectThreadsScrollPane;
    public javax.swing.JList<ThreadList> threadJList;
    private javax.swing.JLabel userGreetingLabel;
    // End of variables declaration//GEN-END:variables
}
