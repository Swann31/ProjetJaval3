/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import gestionnairedemission.Employe;
import gestionnairedemission.Mission;
import static interfaces.MenuPrincipal.listE;
import static interfaces.MenuPrincipal.listM;
import java.awt.BorderLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Swann
 */
public class MenuDetailMissionEmp extends javax.swing.JFrame {

    private static int reftitle = 6;
    /**
     * Creates new form MenuDetailCompetenceEmp
     */
    public MenuDetailMissionEmp(int idEmp) {
        initComponents();
        afficherInfo(idEmp);
        chargerMissions(idEmp);
    }
    
    public MenuDetailMissionEmp(){
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldPrenom = new javax.swing.JTextField();
        jTextFieldIDE = new javax.swing.JTextField();
        jLabelIDE = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jLabelDateD = new javax.swing.JLabel();
        jTextFieldDateD = new javax.swing.JTextField();
        jBtnRetour = new javax.swing.JButton();
        jLabelMission = new javax.swing.JLabel();
        jPanelMissions = new javax.swing.JPanel();
        menuPrincipal = new javax.swing.JMenuBar();
        jMenuPrincipal = new javax.swing.JMenu();
        jMenuPrincpalItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(814, 499));
        setPreferredSize(new java.awt.Dimension(814, 499));

        jTextFieldNom.setEnabled(false);

        jTextFieldPrenom.setEnabled(false);

        jTextFieldIDE.setEnabled(false);
        jTextFieldIDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDEActionPerformed(evt);
            }
        });

        jLabelIDE.setText("ID Employé");

        jLabelPrenom.setText("Prénom");

        jLabelNom.setText("Nom");

        jLabelDateD.setText("Date d'entrée");

        jTextFieldDateD.setEnabled(false);

        jBtnRetour.setText("Retour");
        jBtnRetour.setMaximumSize(new java.awt.Dimension(120, 36));
        jBtnRetour.setMinimumSize(new java.awt.Dimension(120, 36));
        jBtnRetour.setPreferredSize(new java.awt.Dimension(120, 36));
        jBtnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRetourActionPerformed(evt);
            }
        });

        jLabelMission.setText("Missions");

        javax.swing.GroupLayout jPanelMissionsLayout = new javax.swing.GroupLayout(jPanelMissions);
        jPanelMissions.setLayout(jPanelMissionsLayout);
        jPanelMissionsLayout.setHorizontalGroup(
            jPanelMissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );
        jPanelMissionsLayout.setVerticalGroup(
            jPanelMissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        jMenuPrincipal.setText("Application");

        jMenuPrincpalItem1.setText("Fermer");
        jMenuPrincpalItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPrincpalItem1ActionPerformed(evt);
            }
        });
        jMenuPrincipal.add(jMenuPrincpalItem1);

        menuPrincipal.add(jMenuPrincipal);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelMissions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jBtnRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelIDE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldIDE, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelPrenom)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelNom)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelDateD)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDateD, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelMission))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIDE)
                    .addComponent(jTextFieldIDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrenom)
                    .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNom)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDateD)
                    .addComponent(jTextFieldDateD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMission)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelMissions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuPrincpalItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPrincpalItem1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuPrincpalItem1ActionPerformed

    private void jBtnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRetourActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBtnRetourActionPerformed

    private void jTextFieldIDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDEActionPerformed

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
            java.util.logging.Logger.getLogger(MenuDetailMissionEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDetailMissionEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDetailMissionEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDetailMissionEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDetailMissionEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnRetour;
    private javax.swing.JLabel jLabelDateD;
    private javax.swing.JLabel jLabelIDE;
    private javax.swing.JLabel jLabelMission;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JMenu jMenuPrincipal;
    private javax.swing.JMenuItem jMenuPrincpalItem1;
    private javax.swing.JPanel jPanelMissions;
    private javax.swing.JTextField jTextFieldDateD;
    private javax.swing.JTextField jTextFieldIDE;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrenom;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables

    private void afficherInfo(int idEmp)
    {
        Employe e = new Employe();
        e=obtEmp(idEmp);
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = e.getDate();
        String ide = Integer.toString(e.getIdE());
        String pnom = e.getPrenom();
        String nom = e.getNom();
        String dd = df.format(dt);    
        jTextFieldIDE.setText(ide);
        jTextFieldPrenom.setText(pnom);
        jTextFieldNom.setText(nom);
        jTextFieldDateD.setText(dd);
    }
    
    private Employe obtEmp(int idEmp)
    {
        Employe e = new Employe();
        for(int i=0;i<listE.size();i++)
        {
            if(listE.get(i).getIdE()==idEmp)
            {
                e=listE.get(i);
            }
        }
        return e;   
    }
    
    private void chargerMissions(int idEmp){
        int taille = tailleTab(idEmp);
        String[][] tabMiss = new String[taille][reftitle];
        tabMiss=tabMission(taille,idEmp);
        String[] titleM = {"Type Mission","IdM","Descriptif","Date de début","Nb Employes","Date de fin"};
        DefaultTableModel dtm = new DefaultTableModel(tabMiss,titleM);
        JTable table = new JTable(dtm);
        jPanelMissions.setLayout(new BorderLayout());
        JScrollPane tableContainer = new JScrollPane(table);
        jPanelMissions.add(tableContainer, BorderLayout.CENTER);
        this.getContentPane().add(jPanelMissions);
        this.pack();
        this.setVisible(true);
        
    }
    
    private int tailleTab(int idEmp){
        int taille = 0;
        for(int i=0;i<listM.size();i++)
        {
            for(int j=0;j<listM.get(i).getEmployeMission().length;j++)
            {
                int IDE = listM.get(i).getEmployeMission()[j].getIdE();
                if (IDE==idEmp)
                {
                    taille++;
                }
            }
        }
        return taille;
    }
    
    private String[][] tabMission (int taille, int idEmp){
        Mission[] m = new Mission[taille];
        int id=0;
        String[][] tabM = new String[taille][reftitle];
        for(int i=0;i<listM.size();i++)
        {
            for(int j=0;j<listM.get(i).getEmployeMission().length;j++)
            {
                int IDE = listM.get(i).getEmployeMission()[j].getIdE();
                if (IDE==idEmp)
                {
                    m[id]= listM.get(i);
                }
            }
        }
        for(int i=0;i<taille;i++)
        {
            DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String idm, nbe, dd, df;
            dd=sdf.format(m[i].getDateDebut());
            df=sdf.format(m[i].getDateFin());
            idm=String.valueOf(m[i].getIdM());
            nbe=String.valueOf(m[i].getNbEmployes());
            tabM[i][0]=m[i].getTypeM();
            tabM[i][1]=idm;
            tabM[i][2]=m[i].getDescM();
            tabM[i][3]=dd;
            tabM[i][4]=nbe;
            tabM[i][5]=df;
        }
        return tabM;   
    }

}
