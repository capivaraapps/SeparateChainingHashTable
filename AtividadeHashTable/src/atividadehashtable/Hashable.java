/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadehashtable;

/**
 *
 * @author 144162026
 */
public interface Hashable {    
    int hash(int tableSize);
    public String getKey();
    public String getValue();
    public void setKey(String key);
    public void setValue(String value);
}
