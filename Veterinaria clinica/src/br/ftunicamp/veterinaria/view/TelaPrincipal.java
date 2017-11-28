/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.view;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author a101334
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    TelaConsulta telaConsulta = new TelaConsulta();
    TelaAnimais telAnimais = new TelaAnimais();
    TelaCliente telCliente = new TelaCliente();
    TelaSecretaria telSecretaria = new TelaSecretaria();
    TelaVeterinario telVeterinario = new TelaVeterinario();

    public TelaPrincipal() throws PropertyVetoException {
        initComponents();
        jDesktopMain.add(telaConsulta);
        jDesktopMain.add(telAnimais);
        jDesktopMain.add(telCliente);
        jDesktopMain.add(telSecretaria);
        jDesktopMain.add(telVeterinario);
        telaConsulta.setMaximum(true);
        telaConsulta.setVisible(true);

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
        menuVeterinario = new javax.swing.JMenu();
        itemVeterinario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setBackground(new java.awt.Color(82, 58, 21));
        jMenuBar1.setForeground(new java.awt.Color(245, 175, 11));
        jMenuBar1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        menuArquivo.setText("Arquivo");

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
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

        menuVeterinario.setText("Veterinário");
        menuVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVeterinarioActionPerformed(evt);
            }
        });

        itemVeterinario.setText("Veterinários");
        itemVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVeterinarioActionPerformed(evt);
            }
        });
        menuVeterinario.add(itemVeterinario);

        jMenuBar1.add(menuVeterinario);

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
        TelaConsulta telaConsulta = new TelaConsulta();

        telaConsulta.setVisible(true);
    }//GEN-LAST:event_menuAgendaActionPerformed

    private void menuSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSecretariaActionPerformed
        // TODO add your handling code here:
        TelaSecretaria telSecretaria = new TelaSecretaria();
        telSecretaria.setVisible(true);

    }//GEN-LAST:event_menuSecretariaActionPerformed

    private void menuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientesActionPerformed
        // TODO add your handling code here:
        TelaCliente telCliente = new TelaCliente();
        telCliente.setVisible(true);
    }//GEN-LAST:event_menuClientesActionPerformed

    private void menuAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAnimaisActionPerformed
        // TODO add your handling code here:
        TelaAnimais telAnimais = new TelaAnimais();
        telAnimais.setVisible(true);
    }//GEN-LAST:event_menuAnimaisActionPerformed

    private void itemAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgendaActionPerformed
        try {
            telVeterinario.setVisible(false);
            telAnimais.setVisible(false);
            telSecretaria.setVisible(false);
            telCliente.setVisible(false);
            telaConsulta = new TelaConsulta();
            jDesktopMain.add(telaConsulta);
            telaConsulta.setMaximum(true);
            telaConsulta.setVisible(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemAgendaActionPerformed

    private void itemSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSecretariaActionPerformed
        try {
            telVeterinario.setVisible(false);
            telAnimais.setVisible(false);
            telSecretaria.setVisible(false);
            telCliente.setVisible(false);
            telaConsulta.setVisible(false);
            telSecretaria = new TelaSecretaria();
            jDesktopMain.add(telSecretaria);
            telSecretaria.setMaximum(true);
            telSecretaria.setVisible(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemSecretariaActionPerformed

    private void itemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClientesActionPerformed
        // TODO add your handling code here:
        try {
            telVeterinario.setVisible(false);
            telSecretaria.setVisible(false);
            telaConsulta.setVisible(false);
            telAnimais.setVisible(false);
            telCliente = new TelaCliente();
            jDesktopMain.add(telCliente);
            telCliente.setMaximum(true);
            telCliente.setVisible(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemClientesActionPerformed

    private void itemAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAnimaisActionPerformed
        // TODO add your handling code here:
        try {
            telVeterinario.setVisible(false);
            telSecretaria.setVisible(false);
            telaConsulta.setVisible(false);
            telCliente.setVisible(false);
            telAnimais = new TelaAnimais();
            jDesktopMain.add(telAnimais);
            telAnimais.setMaximum(true);
            telAnimais.setVisible(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_itemAnimaisActionPerformed

    private void menuVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVeterinarioActionPerformed
        // TODO add your handling code here:

        telVeterinario.setVisible(true);
        telSecretaria.setVisible(false);
        telaConsulta.setVisible(false);
        telCliente.setVisible(false);
        telAnimais.setVisible(false);
    }//GEN-LAST:event_menuVeterinarioActionPerformed

    private void itemVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVeterinarioActionPerformed
        try {
            telVeterinario.setVisible(true);
            telSecretaria.setVisible(false);
            telaConsulta.setVisible(false);
            telCliente.setVisible(false);
            telAnimais.setVisible(false);
            telVeterinario = new TelaVeterinario();
            jDesktopMain.add(telVeterinario);
            telVeterinario.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        telVeterinario.setVisible(true);


    }//GEN-LAST:event_itemVeterinarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        JFrame telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAgenda;
    private javax.swing.JMenuItem itemAnimais;
    private javax.swing.JMenuItem itemClientes;
    private javax.swing.JMenuItem itemSecretaria;
    private javax.swing.JMenuItem itemVeterinario;
    private javax.swing.JDesktopPane jDesktopMain;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuAgenda;
    private javax.swing.JMenu menuAnimais;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuSecretaria;
    private javax.swing.JMenu menuVeterinario;
    // End of variables declaration//GEN-END:variables
}
