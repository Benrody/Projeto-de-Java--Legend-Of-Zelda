package jogo;

import javax.swing.JOptionPane;
import jplay.GameImage;//importando a janela do jplay
import jplay.Keyboard;//importando o
import jplay.Window;//import jplay.URL;
/**
 *
 * @author ben
 */
public class Main {
    public static void main(String[] args) {
        //1º
        Window janela = new Window(800,600);//tamanho da janela
        //criando o objeto plano do menu principal
        
        //e o metodo URL que chama Sprite
        GameImage plano = new GameImage("src/recursos/sprite/max.jpg");//alterei o menu para cenario
        
        //3º
        Keyboard teclado =  janela.getKeyboard(); //vai instanciar um objeto Janela atravez da classe windows
        
        //2º
        while(true){
            plano.draw();//printar a tela
            janela.update();//atualizando enquanto percorre o loop
           
           //4ºcriar uma condição pra fazer escuta do chamado do teclado
           if(teclado.keyDown(Keyboard.ENTER_KEY)){
               //chamando o cenario passando janela como parametro
               new Cenario1(janela);
           }
        }
    }
}