package model;

/**
 *
 * @author Ziviani, gabrieldutra, MarceloFCandido, rubiotorres
 */
public class ArvoreBinaria {

    private static class No {

        Item reg;
        No esq, dir;
    }

    private No raiz;

    private Item pesquisa(Item reg, No p) {
        // Verifica se o nó atual é Nulo
        if (p == null) {
            return null; // Registro não encontrado
        } else if (reg.compara(p.reg) < 0) { // Se o registro for menor do que o nó, vai pra esquerda na árvore
            return pesquisa(reg, p.esq);
        } else if (reg.compara(p.reg) > 0) { // Se o registro for maior do que o nó, vai pra direita na árvore
            return pesquisa(reg, p.dir);
        } else { // Item encontrado
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

    public ArvoreBinaria() {
        this.raiz = null;
    }

}
