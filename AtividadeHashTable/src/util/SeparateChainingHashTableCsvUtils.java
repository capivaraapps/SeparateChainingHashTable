/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import atividadehashtable.Hashable;
import atividadehashtable.SeparateChainingHashTable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import model.Aluno;
import java.io.File;

/**
 *
 * @author 144162026
 */
public class SeparateChainingHashTableCsvUtils {
    
    public static SeparateChainingHashTable csvToHashTable(String file, 
            String delimiter, 
            boolean primeiraLinha,
            int fator){
        
        int size = 100/fator;
        size = nextPrime(size);
               
        SeparateChainingHashTable ht = new SeparateChainingHashTable(size);
            
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            boolean first = primeiraLinha;
            while ((line = br.readLine()) != null) {
                if(first){
                    first = false;
                }else{
                    String[] values = line.split(delimiter);

                    if(values.length > 2){
                        System.err.println("O arquivo CSV só pode conter duas colunas ('key' e 'value').");
                        return null;
                    }else{
                        ht.insert(new Aluno(values[0],values[1]));
                    }
                }
            }
        }catch(IOException e){
            System.err.println("O arquivo não pode ser lido.");
        }
        return ht;
    }
    
    public static int nextPrime(int number) {
        if(!isPrime(number))
            number = nextPrime(number+1);
        return number;
    }
    
    private static boolean isPrime(int number) {
        for(int i=2; i<=Math.sqrt(number); i++)
            if(number%i == 0) return false;
        return true;
    }
    public static int keyHash(String key, int tableSize){
        return Math.abs(key.hashCode()%tableSize);    
    }
}
