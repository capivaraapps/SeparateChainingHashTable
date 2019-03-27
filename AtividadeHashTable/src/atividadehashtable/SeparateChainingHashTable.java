/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadehashtable;

import java.util.LinkedList;
import util.SeparateChainingHashTableCsvUtils;

/**
 *
 * @author 144162026
 */
public class SeparateChainingHashTable {
    
    private LinkedList<Hashable>[] listas;
    private static final int DEFAULT_TABLE_SIZE = 101;
    
    public SeparateChainingHashTable() {
        this(DEFAULT_TABLE_SIZE);
    }
    public SeparateChainingHashTable( int size ) {
        listas = new LinkedList[SeparateChainingHashTableCsvUtils.nextPrime(size)];
        for(int i=0; i<listas.length; i++)
            listas[i] = new LinkedList<Hashable>();
    }
    public void makeEmpty() {
        for(int i=0; i<listas.length; i++)
        listas[i].clear();
    } 
    public void insert(Hashable x){
        // Efeito: Insere o elemento x na tabela, se o elemento já estiver na tabela não faça nada
        LinkedList<Hashable> lista = listas[x.hash(listas.length)];
        if (lista.indexOf(x) == -1) // equals será usado aqui
            lista.add(0,x);
    }
    public Hashable find(Hashable x){
        // Efeito: Retorna o elemento x, caso ele esteja na tabela, ou null, caso contrário
        LinkedList<Hashable> lista = listas[x.hash(listas.length)];
        if (lista.indexOf(x) == -1) // equals será usado aqui
            return null;
        else
            return x;
    }
    public void remove(Hashable x ) {
        // Efeito: Remove o elemento x na tabela
        LinkedList<Hashable> lista = listas[x.hash(listas.length)];
        if (lista.indexOf(x) != -1) // equals será usado aqui
            lista.remove(x);
    }
    public void printHashTable(){
        // imprime as chaves armazendas na tabela hash
        System.out.println("key\tvalue");
        for(LinkedList<Hashable> lista : listas){
            for(Hashable o : lista){
                System.out.println(o.toString());
            }
        } 
    }
}
