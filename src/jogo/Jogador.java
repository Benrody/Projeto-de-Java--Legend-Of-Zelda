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
        super(URL.sprite("loirinho.png"), 20);//informar o caminho da imagem e numero de frames que possui
        this.x = x;
        this.y = y;
    }
    //criar um metodo publico chamado mover
    //public mover(){
    //}
}
