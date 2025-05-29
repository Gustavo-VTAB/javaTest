public class Suporte extends Boneco {
    private boolean pell;
    private boolean stun;
    private int qtdWard;
    private int gold;
    private int pink;


    public Suporte(String nome, String raca, String roule, String arma, int nivel, boolean pell, boolean stun, int qtdWard, int gold, int pink){
        super(nome, raca, roule, arma, nivel);
        this.pell = pell;
        this.stun = stun;
        this.qtdWard = qtdWard;
        this.gold = gold;
        this.pink = pink;

    }

    @Override
    public void ataqueBasico() {
        System.out.println("toma ataque fraco");

        if (stun){
            System.out.println("Fique parado no meu hit!!");
        }
    }

    @Override
    public void retornarBase(){
        System.out.println("Voltando para pegar ward meno!");
        do {
            qtdWard++;
        }while (qtdWard < 3);
        comprandoPink();
    }

    @Override
    public void farmarGold(){
        System.out.println("Não posso farmar!! Sou suporte irmao!");
        gold+=100;
    }

    @Override
    public void mostrarStatus() {
        System.out.println("----- Status do SUPORTE -----");
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Roule: " + roule);
        System.out.println("Arma: " + arma);
        System.out.println("Nível: " + nivel);
        System.out.println("Estilo: " + (this.pell ? "Peel" : "Stun"));
    }


    public void comprandoPink() {
        if (gold > 75){
            System.out.println("Comprando pink...");
            pink++;
            gold -= 75;
        }else {
            System.out.println("não da pra comprar pink tamo sem gold");
        }

    }

    public void acoes(){
        if (pell){
            System.out.println("Escudinhu");

        } else if (stun) {
            System.out.println("Parado maluko");
        }else{
            System.out.println("Corre que ta sem skill");
        }
    }

    public void visao() {
        if (qtdWard > 0) {
            qtdWard--;
            System.out.println("Colocando ward... wards restantes: " + qtdWard);

        } else if (pink > 0) {
            pink--;
            System.out.println("Colocando ward... wards restantes: " + pink);
        }else {
            System.out.println("volta base pra comprar mais");
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
