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
    public Hashable find(String key){
        LinkedList<Hashable> lista = listas[SeparateChainingHashTableCsvUtils.keyHash(key, listas.length)];
        for(Hashable x : lista){
            if(x.getKey().equals(key)) return x;
        }
        return null;
    }
    public void remove(String key) {
        // Efeito: Remove o elemento x na tabela
        Hashable x = find(key);
        LinkedList<Hashable> lista = listas[x.hash(listas.length)];
        if (lista.indexOf(x) != -1) // equals será usado aqui
            lista.remove(x);
    }
    public void printHashTable(){
        int n=0;
        // imprime as chaves armazendas na tabela hash
        System.out.println("\tkey\tvalue\n");
        for(LinkedList<Hashable> lista : listas){
            if(lista.size() > 0)
                System.out.println("Lista " + n + ":");
            for(Hashable o : lista){
                System.out.println("\t" + o.toString());
            }
            n++;
        } 
    }
    public void analizeTable(){
        String result = "";
        int n = 1;
        int q = 0;
        
        for(LinkedList<Hashable> lista : listas){
            System.out.print("Lista " + n + " :: ");
            result += "Lista " + n + ": ";
            for(Hashable o : lista){
                System.out.print("*");
                q++;
            }
            result += q + " elementos, ";
            if(n%5 == 0) result += "\n";
            q=0;
            System.out.print("\n");
            n++;
        }
        
        System.out.println("\n" + result);
    }
}
