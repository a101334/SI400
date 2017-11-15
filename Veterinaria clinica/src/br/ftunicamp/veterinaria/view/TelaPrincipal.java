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
    TelaSecretaria telSecretaria = new TelaSecretaria();
    TelaVeterinario telVeterinario = new TelaVeterinario();

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
        menuSecretaria = new javax.swing.JMenu();
        itemSecretaria = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenu();
        itemClientes = new javax.swing.JMenuItem();
        menuAnimais = new javax.swing.JMenu();
        itemAnimais = new javax.swing.JMenuItem();
        Veterinario = new javax.swing.JMenu();
        veterinario = new javax.swing.JMenuItem();

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

        menuSecretaria.setText("Secretaria");
        menuSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSecretariaActionPerformed(evt);
            }
        });

        itemSecretaria.setText("Secretaria");
        itemSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSecretariaActionPerformed(evt);
            }
        });
        menuSecretaria.add(itemSecretaria);

        jMenuBar1.add(menuSecretaria);

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

        Veterinario.setText("Veterinário");
        Veterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VeterinarioActionPerformed(evt);
            }
        });

        veterinario.setText("Veterinários");
        Veterinario.add(veterinario);

        jMenuBar1.add(Veterinario);

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
        TelaAgenda telAgenda = new TelaAgenda();
        jDesktopMain.add(telAgenda);
        telAgenda.setVisible(true);
    }//GEN-LAST:event_menuAgendaActionPerformed

    private void menuSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSecretariaActionPerformed
        // TODO add your handling code here:
        TelaSecretaria telSecretaria = new TelaSecretaria();
        jDesktopMain.add(telSecretaria);
        telSecretaria.setVisible(true);

    }//GEN-LAST:event_menuSecretariaActionPerformed

    private void menuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientesActionPerformed
        // TODO add your handling code here:
        TelaCliente telCliente = new TelaCliente();
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
        telVeterinario.setVisible(false);
        telCliente.setVisible(false);
        telAnimais.setVisible(false);
        telSecretaria.setVisible(false);
    }//GEN-LAST:event_itemAgendaActionPerformed

    private void itemSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSecretariaActionPerformed
        // TODO add your handling code here:
        jDesktopMain.add(telSecretaria);

        telVeterinario.setVisible(false);
        telSecretaria.setVisible(true);
        telAgenda.setVisible(false);
        telCliente.setVisible(false);
        telAnimais.setVisible(false);


    }//GEN-LAST:event_itemSecretariaActionPerformed

    private void itemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClientesActionPerformed
        // TODO add your handling code here:
        jDesktopMain.add(telCliente);

        telVeterinario.setVisible(false);
        telSecretaria.setVisible(false);
        telAgenda.setVisible(false);
        telCliente.setVisible(true);
        telAnimais.setVisible(false);
    }//GEN-LAST:event_itemClientesActionPerformed

    private void itemAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAnimaisActionPerformed
        // TODO add your handling code here:
        jDesktopMain.add(telAnimais);

        telVeterinario.setVisible(false);
        telSecretaria.setVisible(false);
        telAgenda.setVisible(false);
        telCliente.setVisible(false);
        telAnimais.setVisible(true);
    }//GEN-LAST:event_itemAnimaisActionPerformed

    private void VeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VeterinarioActionPerformed
        // TODO add your handling code here:
        jDesktopMain.add(telVeterinario);

        telVeterinario.setVisible(true);
        telSecretaria.setVisible(false);
        telAgenda.setVisible(false);
        telCliente.setVisible(false);
        telAnimais.setVisible(false);
    }//GEN-LAST:event_VeterinarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Veterinario;
    private javax.swing.JMenuItem itemAgenda;
    private javax.swing.JMenuItem itemAnimais;
    private javax.swing.JMenuItem itemClientes;
    private javax.swing.JMenuItem itemSecretaria;
    private javax.swing.JDesktopPane jDesktopMain;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuAgenda;
    private javax.swing.JMenu menuAnimais;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuSecretaria;
    private javax.swing.JMenuItem veterinario;
    // End of variables declaration//GEN-END:variables
}
