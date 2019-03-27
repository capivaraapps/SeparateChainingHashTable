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

/**
 *
 * @author 144162026
 */
public class SeparateChainingHashTableCsvUtils {
    
    public static <T> SeparateChainingHashTable csvToHashTable(String file, 
            SeparateChainingHashTable ht, 
            String delimiter, 
            boolean primeiraLinha,
            Class classe){
            
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            if(!Hashable.class.isAssignableFrom(classe)){
                System.err.println("A classe " + classe.getName() + " não é Hashable");
                return null;
            }

            String line;
            boolean first = primeiraLinha;
            while ((line = br.readLine()) != null) {
                if(first) first = false;
                String[] values = line.split(delimiter);
                
                if(values.length > 2){
                    System.err.println("O arquivo CSV só pode conter duas colunas ('key' e 'value').");
                    return null;
                }
                                
                ht.insert((T));
            }
        }catch(IOException e){
            System.err.println("O arquivo não pode ser lido.");
        }catch(ClassNotFoundException e){
            System.err.println("Sua classe não tem construtor :(");
        }
        return ht;
    }
    
    public static int nextPrime(int number) {
        if(!isPrime(number))
            number = nextPrime(number++);
        return number;
    }
    
    private static boolean isPrime(int number) {
        for(int i=2; i<=Math.sqrt(number); i++)
            if(number%i == 0) return false;
        return true;
    }
}
