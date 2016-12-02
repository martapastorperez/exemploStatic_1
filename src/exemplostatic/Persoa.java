/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplostatic;

import javax.swing.JOptionPane;

/**
 *
 * @author mpastorperez
 */
public class Persoa {
    private String nome;
    private int edade;
    private static int numPersoas;

    public Persoa(String nome, int edade) {
        this.nome = nome;
        this.edade = edade;
        numPersoas++;
    }

    public Persoa() {
        numPersoas++;
    }

    public String getNome() {
        return nome;
    }

    public int getEdade() {
        return edade;
    }

    public static int getNumPersoas() {
        return numPersoas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    public static void setNumPersoas(int numPersoas) {
        Persoa.numPersoas = numPersoas;
    }
   /* public static void incrementarPersoas(){
        numPersoas++;
    }*/
    public void visualizar(){
        JOptionPane.showMessageDialog(null,"nome: " + nome + ", edade: " + edade +", numPersoas: "+numPersoas);
                
    }


    
}
