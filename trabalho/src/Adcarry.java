public class Adcarry extends Boneco {
    int critico;
    int gold;
    int item;
    int kills;
    int dano;


    public Adcarry(String nome, String raca, String roule, String arma, int nivel, int critico, int gold, int item, int kills, int dano){
        super(nome, raca, roule, arma, nivel);
        this.critico = critico;
        this.gold = gold;
        this.item = item;
        this.kills = kills;
        this.dano = dano;

    }


    @Override
    public void ataqueBasico() {
        System.out.println("toma hit dolorido");
    }

    @Override
    public void retornarBase(){
        System.out.println("Voltando para comprar item");
    }

    @Override
    public void farmarGold(){
        System.out.println("Me de todo o ouro!!! IMEDIATAMENTE");
    }

    public void ataqueBasico(int critico) {
       if (critico > 2){
            System.out.println("Toma hit critico!!!");
       }
    }

    public void pegandoKill(int kills, int gold, boolean neutralizado){
        int qtdGold;
        String neutra;

        neutra = neutralizado ? "neutralizou" : "abateu";

        if (neutralizado){
            qtdGold = 700;
            gold+= qtdGold;
        }else {
            qtdGold = 400;
            gold+=qtdGold;
        }
        System.out.println("Você " + neutra + " um oponente!!! Recebeu" + qtdGold + " de gold!!");
        kills += 1;
        System.out.println("Gold Atual: " + gold + " Kills atuais: " + kills);
    }

    public void comprandoItem(int gold, int item){

        if (gold < 250){
            System.out.println("Não foi possivel comprar item");
        }else {
            gold-=250;
            item+=1;
            System.out.println("Comprando item...");
            System.out.println("item comprado!! quantidade de itens: " + item + " quantidade de gold: " + gold);
        }

    }




}
