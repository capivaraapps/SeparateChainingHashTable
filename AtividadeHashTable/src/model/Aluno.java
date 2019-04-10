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
        
    public Aluno (String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    public int hash(int tableSize) {
        return Math.abs(matricula.hashCode()%tableSize);
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
        return this.matricula + "  " + this.nome;
    }
}
