package jogo;

import jplay.Keyboard;
import jplay.Sprite;
import jplay.URL;
import jplay.Window;

/**
 *
 * @author ben
 */
//criando o bunequinho sksk
public class Jogador extends Sprite {//jogador deve estender toda a classe sprite
    private double velocidade = 0.3;//velocidade que o jogador vai se mecher pelo cenario
    private int direcao = 3;
    private Keyboard teclado;
    private boolean movendo= false;
    
    
    //ai deve criar o construtor
    public Jogador(int x, int y) {
        super(("src/recursos/sprite/ZELDA.png"), 16);//informar o caminho da imagem e numero de frames que possui
        this.x = x;
        this.y = y;
        this.setTotalDuration(2000);
    }
    /**
     * ////novidde removi esse metodo nativo e criari um novo//////
     * 
    * //criar um metodo publico chamado mover
    public void mover(){
        //fazer uma chamada a 2 metodos da superclasse
        moveX(0.3);//velocidade que o persoagem vai se mover
        moveY(0.3);
        //esse metodo é publico pq vai ser acessado la de Cenario1
        //deve criar um objeto  jogador la em cenario1
    }*/
    public void mover(Window janela){
        //verificar se o teclado é nulo
        if(teclado == null){
            teclado = janela.getKeyboard();
        }
        //verificando as teclas pra saber qual que ta apertando
        //decidindo a diração()eu chamo de sentido kk) que ele ta indo
        if(teclado.keyDown(Keyboard.LEFT_KEY)){
            if(this.x > 0)
                this.x -= velocidade;
            if(direcao != 1){
                setSequence(4, 8);//decide o frame inicial e o final que o personagem vai 
                direcao = 1;
            }movendo = true;
        }
        //condicao pra n deixar o personagem vazar da tela
        else if(teclado.keyDown(Keyboard.RIGHT_KEY)){
            if(this.x < janela.getWidth()-60)//O limite vai ate a largura da janela
                this.x += velocidade;
            if(direcao != 2){
                setSequence(8, 12);//decide o frame inicial e o final que o personagem vai 
                direcao = 2;
            }movendo = true;
        }
        else if(teclado.keyDown(Keyboard.UP_KEY)){
            if(this.y > 0)
                this.y -= velocidade;
            if(direcao != 4){
                setSequence(12, 16);//decide o frame inicial e o final que o personagem vai 
                direcao = 4;
            }movendo = true;
        }
        else if(teclado.keyDown(Keyboard.DOWN_KEY)){
            if(this.y < janela.getHeight()-60)//margemde segurança para asbordas
                this.y += velocidade;
            if(direcao != 5){
                setSequence(0, 4);//decide o frame inicial e o final que o personagem vai 
                direcao = 5;
            }movendo = true;
        }
        //se ele estiver se movendo, vai 
        if(movendo){
            update();
            movendo = false;
        }
    }

}