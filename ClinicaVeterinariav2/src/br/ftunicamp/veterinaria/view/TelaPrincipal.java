/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ftunicamp.veterinaria.view;

/**
 *
 * @author a101334
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuAgenda = new javax.swing.JMenu();
        menuUsuarios = new javax.swing.JMenu();
        menuClientes = new javax.swing.JMenu();
        menuAnimais = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setBackground(new java.awt.Color(82, 58, 21));
        jMenuBar1.setForeground(new java.awt.Color(245, 175, 11));
        jMenuBar1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        menuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/Pacote de Icones/icons 1/application_xp.png"))); // NOI18N
        menuArquivo.setText("Arquivo");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/Pacote de Icones/icons 1/stop.png"))); // NOI18N
        jMenuItem1.setText("Sair");
        menuArquivo.add(jMenuItem1);

        jMenuBar1.add(menuArquivo);

        menuAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/Pacote de Icones/icons 1/calendar.png"))); // NOI18N
        menuAgenda.setText("Agenda");
        jMenuBar1.add(menuAgenda);

        menuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/Pacote de Icones/icons 1/user.png"))); // NOI18N
        menuUsuarios.setText("Usuarios");
        jMenuBar1.add(menuUsuarios);

        menuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/Pacote de Icones/icons 1/group.png"))); // NOI18N
        menuClientes.setText("Clientes");
        jMenuBar1.add(menuClientes);

        menuAnimais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/Pacote de Icones/icons 1/tux.png"))); // NOI18N
        menuAnimais.setText("Animais");
        jMenuBar1.add(menuAnimais);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuAgenda;
    private javax.swing.JMenu menuAnimais;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuUsuarios;
    // End of variables declaration//GEN-END:variables
}
