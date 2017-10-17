/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.model.DAO;

import br.ftunicamp.veterinaria.model.Animal;
import br.ftunicamp.veterinaria.model.Tratamento;
import br.ftunicamp.veterinaria.model.Veterinario;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author thiag
 */
public class TratamentoDAOTest {

    public TratamentoDAOTest() {
    }

    @Test
    @Ignore
    public void inserir() {
        Veterinario veterinario = new Veterinario();
        veterinario.setCodVeterinario(1);
        Animal animal = new Animal();
        animal.setCodAnimal(4);
        Tratamento tratamento = new Tratamento();
        tratamento.setCodTratamento(0);
        tratamento.setAnimal(animal);
        tratamento.setVeterinario(veterinario);
        tratamento.setHistorico("Zerado");
        TratamentoDAO dao = new TratamentoDAO();
        if (dao.inserir(tratamento)) {
            System.out.println("Salvo com sucesso");
        } else {
            fail("Erro ao inserir");
        }
    }

    @Test
    @Ignore
    public void listar() {
        TratamentoDAO dao = new TratamentoDAO();
        for (Tratamento t : dao.listar()) {
            System.out.println("Codigo do tratamento: " + t.getCodTratamento());
            System.out.println("Codigo do animal: " + t.getAnimal().getCodAnimal());
            System.out.println("Codigo do veterinario: " + t.getVeterinario().getCodVeterinario());
            System.out.println("Historico do tratamento: " + t.getHistorico());
        }
    }

    @Test
    @Ignore
    public void atualizar() {
        Tratamento tratamento = new Tratamento();
        tratamento.setCodTratamento(6);
        tratamento.setHistorico("Não encontrado");
        TratamentoDAO dao = new TratamentoDAO();
        if (dao.remover(tratamento)) {
            System.out.println("Atualização realizada com sucesso");
        } else {
            fail("Erro ao atualizar");
        }
    }

    @Test
    @Ignore
    public void remover() {
        Tratamento tratamento = new Tratamento();
        tratamento.setCodTratamento(6);
        TratamentoDAO dao = new TratamentoDAO();
        if (dao.remover(tratamento)) {
            System.out.println("Remoção realizada com sucesso");
        } else {
            fail("Erro ao remover");
        }
    }

    @Test
    //@Ignore
    public void buscar() {
        TratamentoDAO dao = new TratamentoDAO();
        for (Tratamento t : dao.listar()) {
            if (t.getCodTratamento() == 6) {
                System.out.println("Codigo do tratamento: " + t.getCodTratamento());
                System.out.println("Codigo do animal: " + t.getAnimal().getCodAnimal());
                System.out.println("Codigo do veterinario: " + t.getVeterinario().getCodVeterinario());
                System.out.println("Historico do tratamento: " + t.getHistorico());
            }
        }
    }

}
