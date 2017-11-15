/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.dao;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AmadeuCarvalho
 */
public abstract class Serializa {

    private static final Logger LOG = Logger.getLogger(Serializa.class.getName());

    public Serializa() {
    }

    /**
     * Serealiza um arquivo .dat oassado por parametro
     *
     * @author Amadeu Carvalho
     * @param arq - arquivo que deseja serializar
     * @param obj - conteudo do arquivo para serializar
     * @throws java.lang.Exception
     */
    public void serializar(Path arq, Object obj) throws Exception {
        try {
            ObjectOutputStream s = new ObjectOutputStream(
                    Files.newOutputStream(arq));
            s.writeObject(obj);
        } catch (IOException ex) {
            LOG.log(Level.SEVERE, "save", ex);
        }
    }

    /**
     * Carrega um arquivo .dat pré-definido e retorna um objeto
     *
     * @author Amadeu Carvalho
     * @param arq
     * @return Object
     */
    public Object loadSerialized(Path arq) {
        ObjectInputStream is;
        try {
            is = new ObjectInputStream(
                    Files.newInputStream(arq));
            return is.readObject();
        } catch (ClassNotFoundException | IOException ex) {
            LOG.log(Level.SEVERE, "loadSerialized", ex);
        }
        return null;
    }
}
