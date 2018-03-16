package model;

/**
 *
 * @author gabrieldutra, MarceloFCandido, rubiotorres
 */
public class Item {
    private int chave;
    
    /** Construtor do Item
     *
     * @param chave
     */
    public Item(int chave) {
        this.chave = chave;
    }
    
    /** Função para comparar item
     *
     * @param it item a ser comparado
     * @return -1 quando é menor, 0 quando é igual e 1 quando é maior
     */
    public int compara(Item it) {
        Item item = it;
        if (this.chave < item.chave)
            return -1;
        else if (this.chave > item.chave)
            return 1;
        return 0;
    }
    
    /** Retornar Chave
     *
     * @return chave
     */
    public int getChave() {
        return chave;
    }
}