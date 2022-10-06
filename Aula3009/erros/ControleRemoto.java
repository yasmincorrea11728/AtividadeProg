package erros;

public class ControleRemoto {
    
    private boolean estaLigada;
    private int volumeAtual;
    private boolean estaMudo;

    public ControleRemoto(){
        this.estaLigada = false;
        this.volumeAtual = 0;
        this.estaMudo = false;
    }

    public void ligar() throws ControleRemotoException{
        if(this.estaLigada){
            //System.out.println("A TV está ligada");]
            //Exception excecao = new Exception("A TV está ligada");
            //throw excecao;
            throw new ControleRemotoException("A TV está ligada");
        }else{
            this.estaLigada = true;
            System.out.println("A TV ligou");
        }
    }

    public void desligar() throws ControleRemotoException{
        if(this.estaLigada == false){
            //System.out.println("A TV está desligada");
            //Exception excecao = new Exception("A TV está desligada");
            //throw excecao;
            throw new ControleRemotoException("A TV está desligada");
        }else{
            this.estaLigada = false;
            System.out.println("A TV desligou");
        }
    }

    public void aumentarVolume() throws ControleRemotoException{
        if(this.volumeAtual > 95){
            //System.out.println("O volume está no maximo!");
            //Exception excecao = new Exception("O volume está no maximo!");
            //throw excecao;
            throw new ControleRemotoException("O volume está no maximo!");
        }else{
            //this.volumeAtual = this.volumeAtual + 5;
            this.volumeAtual += 5;
            System.out.println("O volume é: " + this.volumeAtual);
        }
    }

    public void diminuirVolume() throws ControleRemotoException{
        if(this.volumeAtual < 5){
            //System.out.println("O volume está no minimo!");
            //Exception excecao = new Exception("O volume está no minimo!");
            //throw excecao;
            throw new ControleRemotoException("O volume está no minimo!");
        }else{
            //this.volumeAtual = this.volumeAtual - 5;
            this.volumeAtual -= 5;
            System.out.println("O volume é: " + this.volumeAtual);
        }
    }

    public void ativarMudo() throws ControleRemotoException{
        if(this.estaMudo){
            //System.out.println("A TV já esta com a opção mudo ligado");
            //Exception excecao = new Exception("A TV já está com a opção mudo ligado");
            //throw excecao;
            throw new ControleRemotoException("A TV já esta com a opção mudo ligado");
        }else{
            this.estaMudo = true;
            System.out.println("A TV está muda");
        }
    }

    public void desligarMudo() throws ControleRemotoException{
        if(this.estaMudo == false){
            //System.out.println("A TV já está com a opção mudo desligado.");
            //Exception excecao = new Exception("A TV já está com a opção mudo desligado.");
            //throw excecao;
            throw new ControleRemotoException("A TV já esta com a opção mudo desligado.");
        }else{
            this.estaMudo = false;
            System.out.println("A TV não está muda.");
        }
    }
    
}