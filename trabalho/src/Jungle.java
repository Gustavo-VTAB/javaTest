public class Jungle extends Boneco {

    int campo;
    int dragao;
    boolean smite;
    int baron;
    boolean roubarObjetivo;

    public Jungle(String nome, String raca, String roule, String arma, int nivel, int campo, int dragao, boolean smite, int baron, boolean roubarObjetivo){
        super(nome, raca, roule, arma, nivel);
        this.campo = campo;
        this.dragao = dragao;
        this.smite = smite;
        this.baron = baron;
        this.roubarObjetivo = roubarObjetivo;

    }


    @Override
    public void ataqueBasico() {
        System.out.println("toma hit campo da selva!!!");
    }

    @Override
    public void retornarBase(){
        System.out.println("Voltando para fazer full clear denovo");
    }

    @Override
    public void farmarGold(){
        System.out.println("Me de ouro Gromp!!!");
    }

    public void ataqueBasico(boolean smite) {
        if (smite){
            System.out.println("Toma hit do SMITEEEEEEEEEEEE!!!");
        }
    }




}
