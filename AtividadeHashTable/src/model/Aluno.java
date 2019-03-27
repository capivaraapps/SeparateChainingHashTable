/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import atividadehashtable.Hashable;

/**
 *
 * @author 144162026
 */
public class Aluno implements Hashable {
    private String nome;
    private String matricula;
        
    public int hash(int tableSize) {
        // utiliza a função hashcode da classe String return
        return matricula.hashCode()%tableSize;
    }
    @Override
    public boolean equals(Object o) {
        try{
            return this.matricula.equals(((Aluno)o).matricula) ;
        }catch(Exception e){
            System.err.println("Não pode comparar a classe " + o.getClass().getName() + " com a classe Aluno");
        }
        return false;
    } 
    @Override
    public String getKey(){
        return matricula;
    }
    @Override
    public String getValue(){
        return nome;
    }
    @Override
    public void setKey(String key){
        this.matricula = key;
    }
    @Override
    public void setValue(String value){
        this.nome = value;
    }
    @Override
    public String toString(){
        return this.matricula + "\t" + this.nome;
    }
}
