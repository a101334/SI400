/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.view;

import javax.swing.JFrame;

/**
 *
 * @author a101334
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    TelaAgenda telAgenda = new TelaAgenda();
    TelaAnimais telAnimais = new TelaAnimais();
    TelaCliente telCliente = new TelaCliente();
    TelaUsuarios telUsuarios = new TelaUsuarios();

    public TelaPrincipal() {
        initComponents();
    }

    public static void main(String[] args) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopMain = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuAgenda = new javax.swing.JMenu();
        itemAgenda = new javax.swing.JMenuItem();
        menuUsuarios = new javax.swing.JMenu();
        itemUsuarios = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenu();
        itemClientes = new javax.swing.JMenuItem();
        menuAnimais = new javax.swing.JMenu();
        itemAnimais = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setBackground(new java.awt.Color(82, 58, 21));
        jMenuBar1.setForeground(new java.awt.Color(245, 175, 11));
        jMenuBar1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        menuArquivo.setText("Arquivo");

        jMenuItem1.setText("Sair");
        menuArquivo.add(jMenuItem1);

        jMenuBar1.add(menuArquivo);

        menuAgenda.setText("Agenda");
        menuAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgendaActionPerformed(evt);
            }
        });

        itemAgenda.setText("Agenda");
        itemAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgendaActionPerformed(evt);
            }
        });
        menuAgenda.add(itemAgenda);

        jMenuBar1.add(menuAgenda);

        menuUsuarios.setText("Usuarios");
        menuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuariosActionPerformed(evt);
            }
        });

        itemUsuarios.setText("Usuarios");
        itemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemUsuarios);

        jMenuBar1.add(menuUsuarios);

        menuClientes.setText("Clientes");
        menuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientesActionPerformed(evt);
            }
        });

        itemClientes.setText("Clientes");
        itemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClientesActionPerformed(evt);
            }
        });
        menuClientes.add(itemClientes);

        jMenuBar1.add(menuClientes);

        menuAnimais.setText("Animais");
        menuAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAnimaisActionPerformed(evt);
            }
        });

        itemAnimais.setText("Animais");
        itemAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAnimaisActionPerformed(evt);
            }
        });
        menuAnimais.add(itemAnimais);

        jMenuBar1.add(menuAnimais);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopMain, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopMain, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgendaActionPerformed
        // TODO add your handling code here:
        jDesktopMain.add(telAgenda);
        telAgenda.setVisible(true);
    }//GEN-LAST:event_menuAgendaActionPerformed

    private void menuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuariosActionPerformed
        // TODO add your handling code here:
        jDesktopMain.add(telUsuarios);
        telUsuarios.setVisible(true);

    }//GEN-LAST:event_menuUsuariosActionPerformed

    private void menuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientesActionPerformed
        // TODO add your handling code here:
        jDesktopMain.add(telCliente);
        telCliente.setVisible(true);
    }//GEN-LAST:event_menuClientesActionPerformed

    private void menuAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAnimaisActionPerformed
        // TODO add your handling code here:
        TelaAnimais telAnimais = new TelaAnimais();
        jDesktopMain.add(telAnimais);
        telAnimais.setVisible(true);
    }//GEN-LAST:event_menuAnimaisActionPerformed

    private void itemAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgendaActionPerformed
        // TODO add your handling code here:
        jDesktopMain.add(telAgenda);

        telAgenda.setVisible(true);

        telCliente.setVisible(false);
        telAnimais.setVisible(false);
        telUsuarios.setVisible(false);
    }//GEN-LAST:event_itemAgendaActionPerformed

    private void itemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUsuariosActionPerformed
        // TODO add your handling code here:
        jDesktopMain.add(telUsuarios);

        telUsuarios.setVisible(true);
        telAgenda.setVisible(false);
        telCliente.setVisible(false);
        telAnimais.setVisible(false);


    }//GEN-LAST:event_itemUsuariosActionPerformed

    private void itemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClientesActionPerformed
        // TODO add your handling code here:
        jDesktopMain.add(telCliente);

        telUsuarios.setVisible(false);
        telAgenda.setVisible(false);
        telCliente.setVisible(true);
        telAnimais.setVisible(false);
    }//GEN-LAST:event_itemClientesActionPerformed

    private void itemAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAnimaisActionPerformed
        // TODO add your handling code here:
        jDesktopMain.add(telAnimais);

        telUsuarios.setVisible(false);
        telAgenda.setVisible(false);
        telCliente.setVisible(false);
        telAnimais.setVisible(true);
    }//GEN-LAST:event_itemAnimaisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAgenda;
    private javax.swing.JMenuItem itemAnimais;
    private javax.swing.JMenuItem itemClientes;
    private javax.swing.JMenuItem itemUsuarios;
    private javax.swing.JDesktopPane jDesktopMain;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuAgenda;
    private javax.swing.JMenu menuAnimais;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuUsuarios;
    // End of variables declaration//GEN-END:variables
}
