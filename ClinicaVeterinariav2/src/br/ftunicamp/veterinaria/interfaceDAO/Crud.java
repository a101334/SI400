/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.interfaceDAO;

import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author thiag
 */
public interface Crud {
    boolean inserir();
    ResultSet buscar(int id);
    List listar();
    void atualizar(Object o);
    void remover(Object o);
}
