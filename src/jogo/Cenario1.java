package jogo;

import jplay.Scene;
import jplay.URL;
import jplay.Window;

/**
 *
 * @author ben
 */
public class Cenario1 {
    private Window janela;// usar um objeto da classe window
    private Scene cena;//sempre usar para o arquivo que molda o cenário
    
    //06 Criar o construtor dessa classe
    public Cenario1(Window window){// vai recebero parametro do tipo window da classe anterior
        janela = window;//janela vaireceber o window
        cena = new Scene();// instanciar a cena
        cena.loadFromFile(URL.scenario("cenario1.scn"));//recebe o arquivo tile que vai dar o cenario
        
        //criar um metodo run pra deixar o metoo infinito igual a tela de menu
        run();
    }
    private void run() {
        while(true){
            cena.draw();
            janela.update();
        }
    }


}
