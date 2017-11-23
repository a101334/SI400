/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.interfaces;

import java.util.List;

/**
 *
 * @author thiag
 */
public interface Crud<T> {
    boolean inserir(T classe);
    T buscar(String nome);
    List listar();
    boolean atualizar(T classe);
    boolean remover(int id);
    List<T> carregarArquivo();
}
