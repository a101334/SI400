/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.view;

import br.ftunicamp.veterinaria.control.AnimalControle;
import br.ftunicamp.veterinaria.control.PessoaControle;
import br.ftunicamp.veterinaria.model.Animal;
import br.ftunicamp.veterinaria.model.Pessoa;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author a101334
 */
public class TelaAnimais extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaAnimais
     */
    PessoaControle pessoaControle = new PessoaControle();
    Animal animal = new Animal();

    public TelaAnimais() {
        initComponents();
        preencherTabelaAnimal();
        preencherTabelaCliente();
    }

    private void preencherTabelaAnimal() {
        DefaultTableModel tabela = (DefaultTableModel) tabelaAnimal.getModel();
        tabela.setNumRows(0);
        List<Animal> animais = new ArrayList<Animal>();
        AnimalControle animalControle = new AnimalControle();
        try {
            animais = animalControle.listar();
            for (Animal a : animais) {
                tabela.addRow(new Object[]{
                    a.getCodAnimal(),
                    a.getNomeAnimal(),
                    a.getRaca(),
                    a.getSexo(),
                    a.getNascimentoAnimal(),
                    a.getEspecie()
                });
            }
        } catch (Exception e) {

        }
    }

    private void preencherTabelaCliente() {
        DefaultTableModel tabela = (DefaultTableModel) tabelaCliente.getModel();
        tabela.setNumRows(0);
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        PessoaControle pessoaControle = new PessoaControle();
        try {
            pessoas = pessoaControle.listar();
            for (Pessoa p : pessoas) {
                tabela.addRow(new Object[]{
                    p.getNome(),
                    p.getCpf()
                });
            }
        } catch (Exception e) {

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

        lblNome = new javax.swing.JLabel();
        txtNomeAnimal = new javax.swing.JTextField();
        lblNascimento = new javax.swing.JLabel();
        dtNascimento = new com.toedter.calendar.JCalendar();
        lblSexo = new javax.swing.JLabel();
        cbxSexo = new javax.swing.JComboBox<>();
        lblEspecie = new javax.swing.JLabel();
        cbxEspecie = new javax.swing.JComboBox<>();
        lblRaca = new javax.swing.JLabel();
        txtRaca = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAnimal = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnRemover = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        lblSuccess = new javax.swing.JLabel();

        lblNome.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblNome.setText("Nome");

        lblNascimento.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblNascimento.setText("Nascimento");

        lblSexo.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblSexo.setText("Sexo");

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Macho", "Femea" }));

        lblEspecie.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblEspecie.setText("Especie");

        cbxEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cachorro", "Gato", "Coelho", "Pássaro" }));

        lblRaca.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblRaca.setText("Raça");

        txtRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRacaActionPerformed(evt);
            }
        });

        btnInserir.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        tabelaAnimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Raca", "Sexo", "Nascimento", "Espécie"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selecionarAnimal(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAnimal);
        if (tabelaAnimal.getColumnModel().getColumnCount() > 0) {
            tabelaAnimal.getColumnModel().getColumn(0).setResizable(false);
        }

        btnRemover.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/icon/turkey-icon_36959.png"))); // NOI18N
        jLabel2.setText("               ");

        btnAtualizar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaCliente);

        lblSuccess.setForeground(new java.awt.Color(51, 102, 255));
        lblSuccess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(844, 844, 844)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEspecie)
                                    .addComponent(lblSexo)
                                    .addComponent(lblRaca))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRaca)
                                    .addComponent(cbxSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(lblSuccess, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNascimento)
                            .addComponent(dtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSexo)
                            .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEspecie)
                            .addComponent(cbxEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRaca)
                            .addComponent(txtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSuccess)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRacaActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        AnimalControle animalControle = new AnimalControle();
        List<Animal> animais = new ArrayList<Animal>();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        try {
            if (animal.getPessoa().getCpf() != null) {
                java.util.Date dateStr = formatter.parse(formatter.format(dtNascimento.getCalendar().getTime()));
                animais = animalControle.listar();
                animal.setCodAnimal(animais.size());
                animal.setNomeAnimal(txtNomeAnimal.getText());
                animal.setEspecie(cbxEspecie.getModel().getSelectedItem().toString());
                animal.setRaca(txtRaca.getText());
                animal.setNascimentoAnimal(formatter.format(dateStr));
                animal.setSexo(cbxSexo.getModel().getSelectedItem().toString());
                animal.getPessoa().setCodPessoa(2);
                animalControle.insertAnimal(animal);
                preencherTabelaAnimal();
                lblSuccess.setText("Animal " + animal.getNomeAnimal() + " cadastrado com sucesso!");
                limparTela();
            } else {
                JOptionPane.showMessageDialog(null, "Você precisa selecionar um cliente", "Erro", 2);
            }
        } catch (ParseException ex) {
            Logger.getLogger(TelaAnimais.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Neste campo é permitido somente numeros","Erro", 0);
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void selecionarAnimal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selecionarAnimal
        // int linhaSelecionada = tabelaAnimal.getSelectedRow();//pegar a linha selecionada  
        List<Animal> animais = new ArrayList<Animal>();
        AnimalControle animalControle = new AnimalControle();
        animais = animalControle.listar();
        animal = animais.get(tabelaAnimal.getSelectedRow());//pegar os valores da linha e coluna       
        txtNomeAnimal.setText(animal.getNomeAnimal());
        cbxSexo.getModel().setSelectedItem(animal.getSexo());
        cbxEspecie.getModel().setSelectedItem(animal.getEspecie());
        txtRaca.setText(animal.getRaca());
    }//GEN-LAST:event_selecionarAnimal

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        AnimalControle animalControle = new AnimalControle();
        animalControle.remover(tabelaAnimal.getSelectedRow());
        lblSuccess.setText("Animal " + animal.getNomeAnimal() + " removido com sucesso!");
        limparTela();
        preencherTabelaAnimal();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        TelaConsultaAnimais consultaAnimais = new TelaConsultaAnimais();
        consultaAnimais.setVisible(true);
        consultaAnimais.setLocationRelativeTo(null);
        //consultas.listarConsultas();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        AnimalControle animalControle = new AnimalControle();
        
        try
        {
            animal.setNomeAnimal(txtNomeAnimal.getText());
            animal.setEspecie(cbxEspecie.getModel().getSelectedItem().toString());
            animal.setRaca(txtRaca.getText());
            animal.setSexo(cbxSexo.getModel().getSelectedItem().toString());
            animalControle.atualizar(animal, tabelaAnimal.getSelectedRow());
            preencherTabelaAnimal();
            lblSuccess.setText("Animal " + animal.getNomeAnimal() + " atualizado com sucesso!");
            limparTela();
        }
        catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Neste campo é permitido somente numeros","Erro", 0);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void tabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMouseClicked
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        PessoaControle pessoaControle = new PessoaControle();
        pessoas = pessoaControle.listar();
        Pessoa pessoa = new Pessoa();
        pessoa = pessoas.get(tabelaCliente.getSelectedRow());//pegar os valores da linha e coluna           
        animal.setPessoa(pessoa);
    }//GEN-LAST:event_tabelaClienteMouseClicked

    private void limparTela() {
        for (int i = 0; i < getContentPane().getComponentCount(); i++) {
            //varre todos os componentes
            Component c = getContentPane().getComponent(i);
            if (c instanceof JTextField) {
                //apaga os valores
                JTextField field = (JTextField) c;
                field.setText("");
                //System.out.println("apagando campo " + i);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cbxEspecie;
    private javax.swing.JComboBox<String> cbxSexo;
    private com.toedter.calendar.JCalendar dtNascimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRaca;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSuccess;
    private javax.swing.JTable tabelaAnimal;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTextField txtNomeAnimal;
    private javax.swing.JTextField txtRaca;
    // End of variables declaration//GEN-END:variables
}
