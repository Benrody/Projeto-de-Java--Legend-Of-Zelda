package jogo;

import jplay.Sprite;
import jplay.URL;

/**
 *
 * @author ben
 */
//criando o bunequinho sksk
public class Jogador extends Sprite {//jogador deve estender toda a classe sprite

    
    //ai deve criar o construtor
    public Jogador(int x, int y) {
        super(("src/recursos/sprite/jogador.png"), 20);//informar o caminho da imagem e numero de frames que possui
        this.x = x;
        this.y = y;
    }
    //criar um metodo publico chamado mover
    public void mover(){
        //fazer uma chamada a 2 metodos da superclasse
        moveX(0.3);//velocidade que o persoagem vai se mover
        moveY(0.3);
        //esse metodo é publico pq vai ser acessado la de Cenario1
        //deve criar um objeto  jogador la em cenario1
    }
}
