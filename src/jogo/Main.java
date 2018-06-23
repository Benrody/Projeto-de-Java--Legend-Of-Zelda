package jogo;

import jplay.GameImage;//importando a janela do jplay
import jplay.Window;//import jplay.URL;
/**
 *
 * @author ben
 */
public class Main {
    public static void main(String[] args) {
        Window janela = new Window(800,600);//tamanho da janela
        //criando o objeto plano do menu principal
        //e o metodo URL que chama Sprite
        GameImage plano = new GameImage("src/recursos/sprite/menu.png");
        //2º
        
        //1º
        while(true){
            plano.draw();//printar a tela
            janela.update();//atualizando enquanto percorre o loop
        }
    }
}