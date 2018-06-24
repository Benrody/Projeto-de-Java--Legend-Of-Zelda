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
    private Jogador jogador;//depois nstanciar
    
    //06 Criar o construtor dessa classe
    public Cenario1(Window window){// vai recebero parametro do tipo window da classe anterior
        janela = window;//janela vaireceber o window
        
        cena = new Scene();// instanciar a cena
        cena.loadFromFile(URL.scenario("cenario1.scn"));//recebe o arquivo tile que vai dar o cenario
        
        jogador = new Jogador(640, 350);    //instanciando o jogador passando as oordenadas
        //depois ir no metod run e printaro jogador
        
        
        //criar um metodo run pra deixar o metoo infinito igual a tela de menu
        run();
    }
    private void run() {
        while(true){
            cena.draw();
            jogador.draw();//pritando jogador
            jogador.mover();//movimentar jogador usando o metodo mover que criei
            janela.update();
        }
    }


}
