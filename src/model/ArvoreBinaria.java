package model;

/**
 * Classe Árvore Binária
 *
 * @author Ziviani, gabrieldutra, MarceloFCandido, rubiotorres
 */
public class ArvoreBinaria {

    private static class No {

        Item reg;
        No esq, dir;
    }

    private No raiz;
    private static int contadorDeComps = 0;

    private Item pesquisa(Item reg, No p) {

        // Verifica se o nó atual é Nulo
        if (p == null) {
            System.out.println("Comparações: " + contadorDeComps);
            contadorDeComps = 0;
            return null; // Registro não encontrado
        } else if (reg.compara(p.reg) < 0) { // Se o registro for menor do que 
            // o nó, vai pra esquerda na árvore
            contadorDeComps++;
            return pesquisa(reg, p.esq);
        } else if (reg.compara(p.reg) > 0) { // Se o registro for maior do que 
            // o nó, vai pra direita na árvore
            contadorDeComps++;
            return pesquisa(reg, p.dir);
        } else { // Item encontrado
            System.out.println("Comparações: " + contadorDeComps);
            contadorDeComps = 0;
            return p.reg;
        }
    }

    private No insere(Item reg, No p) {
        // Verifica se o nó atual é Nulo
        if (p == null) {
            p = new No();
            p.reg = reg;
            p.esq = null;
            p.dir = null;
        } else if (reg.compara(p.reg) < 0) { // Se o registro for menor do que o nó, vai pra esquerda na árvore
            p.esq = insere(reg, p.esq);
        } else if (reg.compara(p.reg) > 0) { // Se o registro for maior do que o nó, vai pra direita na árvore
            p.dir = insere(reg, p.dir);
        } else { // O item é igual, então já existe
            System.out.println("Erro: Registro ja existente");
        }
        return p;
    }

    /**
     * Construtor da Árvore Binária
     *
     */
    public ArvoreBinaria() {
        this.raiz = null;
    }

    /**
     * Função para inserir item
     *
     * @param reg item a ser inserido
     */
    public void insere(Item reg) {
        this.raiz = this.insere(reg, this.raiz);
    }

    public Item pesquisa(Item reg) {
        Item a = this.pesquisa(reg, this.raiz);
        return a;
    }

}
