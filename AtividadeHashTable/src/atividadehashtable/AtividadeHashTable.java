
package atividadehashtable;

import java.io.File;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Aluno;
import util.SeparateChainingHashTableCsvUtils;

/**
 *
 * @author 144162026
 */
public class AtividadeHashTable {
        
    public static void main(String[] args) throws InterruptedException {
        
        Scanner sc = new Scanner(System.in); 
        
        
        System.out.println("\n\nAPLICAÇÃO DA TABELA HASH COM ENCADENAMENTO SEPARADO\n\n");
        System.out.println("\n\nAPERTE UMA TECLA PARA CONTINUAR\n\n");
        sc.nextLine();
        
        //TESTE 1.1 -> INSERÇÃO FATOR 1
        
        SeparateChainingHashTable ht =
                SeparateChainingHashTableCsvUtils.csvToHashTable("./src/resources/alunos.csv",";",false,1);
        
        System.out.println("TESTE 1.1 -> INSERÇÃO FATOR 1\n\n");
        TimeUnit.SECONDS.sleep(1);
        ht.printHashTable();
           
        System.out.println("\n\nAPERTE UMA TECLA PARA CONTINUAR\n\n");
        sc.nextLine();
        
        //TESTE 1.2 -> REMOÇÃO DOS ALUNOS COM MATRICULA 5 ~ 9
        
        ht.remove("5");
        ht.remove("6");
        ht.remove("7");
        ht.remove("8");
        ht.remove("9");
        System.out.println("TESTE 1.2 -> REMOÇÃO DOS ALUNOS COM MATRICULA 5 ~ 9\n\n");
        TimeUnit.SECONDS.sleep(1);
        ht.printHashTable();
           
        System.out.println("\n\nAPERTE UMA TECLA PARA CONTINUAR\n\n");
        sc.nextLine();
                
        //TESTE 1.4 -> NÚMERO DE ELEMENTOS POR LISTA ENCADEADA
        
        System.out.println("TESTE 1.4 -> NÚMERO DE ELEMENTOS POR LISTA ENCADEADA");
        TimeUnit.SECONDS.sleep(1);
        ht.analizeTable();
           
        System.out.println("\n\nAPERTE UMA TECLA PARA CONTINUAR\n\n");
        sc.nextLine();
        
        ht = null;
        //TESTE 2.1 -> INSERÇÃO FATOR 2
        
        ht = SeparateChainingHashTableCsvUtils.csvToHashTable("./src/resources/alunos.csv",";",false,2);
        
        System.out.println("TESTE 2.1 -> INSERÇÃO FATOR 2\n\n");
        TimeUnit.SECONDS.sleep(1);
        ht.printHashTable();
           
        System.out.println("\n\nAPERTE UMA TECLA PARA CONTINUAR\n\n");
        sc.nextLine();
        
        //TESTE 2.2 -> REMOÇÃO DOS ALUNOS COM MATRICULA 10
        
        ht.remove("10");
        ht.remove("11");
        ht.remove("12");
        ht.remove("13");
        ht.remove("14");
        System.out.println("TESTE 2.2 -> REMOÇÃO DOS ALUNOS COM MATRICULA 10\n\n");
        TimeUnit.SECONDS.sleep(1);
        ht.printHashTable();
           
        System.out.println("\n\nAPERTE UMA TECLA PARA CONTINUAR\n\n");
        sc.nextLine();
                
        //TESTE 2.4 -> NÚMERO DE ELEMENTOS POR LISTA ENCADEADA
        
        System.out.println("TESTE 2.4 -> NÚMERO DE ELEMENTOS POR LISTA ENCADEADA");
        TimeUnit.SECONDS.sleep(1);
        ht.analizeTable();
           
        System.out.println("\n\nAPERTE UMA TECLA PARA CONTINUAR\n\n");
        sc.nextLine();
        
        ht = null;
        //TESTE 3.1 -> INSERÇÃO FATOR 5
        
        ht = SeparateChainingHashTableCsvUtils.csvToHashTable("./src/resources/alunos.csv",";",false,5);
        
        System.out.println("TESTE 3.1 -> INSERÇÃO FATOR 5\n\n");
        TimeUnit.SECONDS.sleep(1);
        ht.printHashTable();
           
        System.out.println("\n\nAPERTE UMA TECLA PARA CONTINUAR\n\n");
        sc.nextLine();
        
        //TESTE 3.2 -> REMOÇÃO DOS ALUNOS COM MATRICULA 15
        
        ht.remove("15");
        ht.remove("16");
        ht.remove("17");
        ht.remove("18");
        ht.remove("19");
        System.out.println("TESTE 3.2 -> REMOÇÃO DOS ALUNOS COM MATRICULA 15\n\n");
        TimeUnit.SECONDS.sleep(1);
        ht.printHashTable();
           
        System.out.println("\n\nAPERTE UMA TECLA PARA CONTINUAR\n\n");
        sc.nextLine();
                
        //TESTE 3.4 -> NÚMERO DE ELEMENTOS POR LISTA ENCADEADA
        
        System.out.println("TESTE 3.4 -> NÚMERO DE ELEMENTOS POR LISTA ENCADEADA");
        TimeUnit.SECONDS.sleep(1);
        ht.analizeTable();
           
        System.out.println("\n\nAPERTE UMA TECLA PARA CONTINUAR\n\n");
        sc.nextLine();
        
        ht = null;
        //TESTE 4.1 -> INSERÇÃO FATOR 10
        
        ht = SeparateChainingHashTableCsvUtils.csvToHashTable("./src/resources/alunos.csv",";",false,10);
        
        System.out.println("TESTE 4.1 -> INSERÇÃO FATOR 10\n\n");
        TimeUnit.SECONDS.sleep(1);
        ht.printHashTable();
           
        System.out.println("\n\nAPERTE UMA TECLA PARA CONTINUAR\n\n");
        sc.nextLine();
        
        //TESTE 4.2 -> REMOÇÃO DOS ALUNOS COM MATRICULA 15
        
        ht.remove("20");
        ht.remove("21");
        ht.remove("22");
        ht.remove("23");
        ht.remove("24");
        System.out.println("TESTE 4.2 -> REMOÇÃO DOS ALUNOS COM MATRICULA 20\n\n");
        TimeUnit.SECONDS.sleep(1);
        ht.printHashTable();
           
        System.out.println("\n\nAPERTE UMA TECLA PARA CONTINUAR\n\n");
        sc.nextLine();
                
        //TESTE 4.4 -> NÚMERO DE ELEMENTOS POR LISTA ENCADEADA
        
        System.out.println("TESTE 4.4 -> NÚMERO DE ELEMENTOS POR LISTA ENCADEADA");
        TimeUnit.SECONDS.sleep(1);
        ht.analizeTable();
           
        System.out.println("\n\nAPERTE UMA TECLA PARA FINALIZAR\n\n");
        sc.nextLine();
    }
    
}
