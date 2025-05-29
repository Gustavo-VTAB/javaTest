public class Adcarry extends Boneco {
    private int critico;
    private int gold;
    private int item;
    private int kills;
    private int dano;
    private int morte;

    public Adcarry(String nome, String raca, String roule, String arma, int nivel, int critico, int gold, int item, int kills, int dano, int morte){
        super(nome, raca, roule, arma, nivel);
        this.critico = critico;
        this.gold = gold;
        this.item = item;
        this.kills = kills;
        this.dano = dano;
        this.morte = morte;

    }

    @Override
    public void ataqueBasico() {
        System.out.println("toma hit dolorido");

        if (critico > 2){
            System.out.println("Toma hit critico!!!");
        }
    }

    @Override
    public void retornarBase(){
        System.out.println("Voltando para comprar item");
        comprandoItem();
    }

    @Override
    public void farmarGold(){
        System.out.println("Me de todo o ouro!!! IMEDIATAMENTE");
        gold += 100;
    }

    @Override
    public void mostrarStatus() {
        System.out.println("----- Status do ADCARRY -----");
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Roule: " + roule);
        System.out.println("Arma: " + arma);
        System.out.println("Nível: " + nivel);
        System.out.println("Críticos: " + this.critico);
    }

    public void caitin(boolean habilidade) {
       if (habilidade){
           System.out.println("TOMA CAITIN MENO, OLHA O SPACE DO PAI");
           pegandoKill(false);
           dano+= 500;
       }else {
           System.out.println("Sou prata tomei gap");
           morte++;
           dano+= 300;
       }
    }

    public void pegandoKill( boolean neutralizado){
        int qtdGold;
        String neutra;

        neutra = neutralizado ? "neutralizou" : "abateu";

        if (neutralizado){
            qtdGold = 700;
            gold+= qtdGold;
            dano+=1000;
        }else {
            qtdGold = 400;
            gold+=qtdGold;
        }
        System.out.println("Você " + neutra + " um oponente!!! Recebeu" + qtdGold + " de gold!!");
        kills += 1;
        System.out.println("Gold Atual: " + gold + " Kills atuais: " + kills);
    }

    public void comprandoItem(){

        if (gold < 250){
            System.out.println("Não foi possivel comprar item");
        }else {
            gold-=250;
            item+=1;
            critico+=10;
            dano+=100;

            System.out.println("Comprando item...");
            System.out.println("item comprado!! quantidade de itens: " + item + " quantidade de gold: " + gold);
        }

    }



    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getCritico() {
        return critico;
    }

    public void setCritico(int critico) {
        this.critico = critico;
    }

    public int getMorte() {
        return morte;
    }

    public void setMorte(int morte) {
        this.morte = morte;
    }
}
