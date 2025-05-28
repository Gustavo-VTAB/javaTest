public class Suporte extends Boneco {
    private boolean pell;
    private boolean stun;
    private

    public Suporte(String nome, String raca, String roule, String arma, int nivel, boolean pell, boolean stun){
        super(nome, raca, roule, arma, nivel);
        this.pell = pell;
        this.stun = stun;

    }

    @Override
    public void ataqueBasico() {
        System.out.println("toma ataque fraco");
    }

    @Override
    public void retornarBase(){
        System.out.println("Voltando para pegar ward meno!");
    }

    @Override
    public void farmarGold(){
        System.out.println("Não posso farmar!! Sou suporte irmao!");
    }

    public void ataqueBasico(boolean stun) {
        if (stun){
            System.out.println("Fique parado no meu hit!!");
        }
    }

    public void acoes(boolean pell, boolean stun){
        if (pell){
            System.out.println("Escudinhu");

        } else if (stun) {
            System.out.println("Parado maluko");
        }else{
            System.out.println("Corre que ta sem skill");
        }
    }

    public boolean getStun() {
        return stun;
    }

    public void setStun(boolean stun) {
        this.stun = stun;
    }

    public boolean getPell() {
        return pell;
    }

    public void setPell(boolean pell) {
        this.pell = pell;
    }
}
