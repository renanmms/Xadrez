/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

/**
 *
 * Exercício 22
● Supondo que você vá programar um jogo de xadrez, construa uma classe
Peça, com atributos tipo, cor e posição (formada por coluna e linha - ex: “a7”)
● Crie um ArrayList para armazenar objetos dinâmicos do tipo Peça.
● Armazene 32 peças, sendo 16 brancas e 16 pretas, com os seguintes tipos:
○ 8 peões ; 2 torres ; 2 cavalos ; 2 bispos ; 1 rainha e 1 rei
● Depois encontre uma peça pela posição e a remova do ArrayList
● Imprima todos as peças restantes.

 * @author unifrsilva
 */
public class Pecas {
    private String tipo;
    private String cor;
    private String posicao;
    
    Pecas(String cor, String tipo){
        this.tipo = tipo;
        this.cor = cor;
        
    }
            
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    
    
}
