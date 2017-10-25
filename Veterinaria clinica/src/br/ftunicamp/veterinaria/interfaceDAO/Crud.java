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
public interface Crud<T> {
    boolean inserir(T classe);
    List buscar(int id);
    List listar();
    boolean atualizar(T classe);
    boolean remover(T classe);
}