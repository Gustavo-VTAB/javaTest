import java.util.Scanner;

public class Jungle extends Boneco {

    private int campo;
    private int dragao;
    private boolean smite;
    private int baron;
    private boolean roubarObjetivo;

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
        if (smite){
            System.out.println("Toma hit do SMITEEEEEEEEEEEE!!!");
        }
    }

    @Override
    public void retornarBase(){
        System.out.println("Voltando para fazer full clear denovo");
    }

    @Override
    public void farmarGold(){
        System.out.println("Me de ouro Gromp!!!");
        campo++;
    }

    public boolean dominarTerreno(boolean team) {
        if (team) {
            System.out.println("Junta rapaziada vamo dominar");
            return true;
        }else {
            System.out.println("Não temos pressão não da pra entrar");
            return false;
        }
    }

    public void rouboDeObjetivo(){
        if(roubarObjetivo){
            System.out.println("ROUBOOOOOOOOOOOOOOOOUUUUUUUUUUUUUUUU É INCRIVEEEEEEELLLL");
            System.out.println("CALIBRA O SMITE REVOLTAAAAAAAA!!!!!!!!!!!!!!!!");
        }else {
            System.out.println("Foi no 50/50 tava dificil");
            System.out.println("NT: NEM TENTOU MNW");
        }
    }

    public void objetivoFeito(){
        Scanner scanner = new Scanner(System.in);

        if (smite && dominarTerreno(true)){
            System.out.println("Voce fez Dragão ou Baron?");
            System.out.println("1. Dragão ");
            System.out.println("2. Baron ");
            System.out.println("Escolha uma das opções");
            int escolha = scanner.nextInt();

            if (escolha == 1){
                dragao++;
                System.out.println("Dragão pego rapaziada bora de base! Total de Drags: " + dragao);
            } else if (escolha == 2) {
                baron++;
                System.out.println("Barão pego guys, da b, junta top e vamo t3! Barons pegos: " + baron);
            } else {
                System.out.println("Escolhe 1 ou 2 mnw não é tão dificil assim... Nenhum objetivo capiturado...");
            }
        }else {
            System.out.println("Sem smite espera pela volta para dominar terreno");
        }
    }


    public int getCampo() {
        return campo;
    }

    public void setCampo(int campo) {
        this.campo = campo;
    }

    public int getDragao() {
        return dragao;
    }

    public void setDragao(int dragao) {
        this.dragao = dragao;
    }

    public boolean isSmite() {
        return smite;
    }

    public void setSmite(boolean smite) {
        this.smite = smite;
    }

    public int getBaron() {
        return baron;
    }

    public void setBaron(int baron) {
        this.baron = baron;
    }

    public boolean isRoubarObjetivo() {
        return roubarObjetivo;
    }

    public void setRoubarObjetivo(boolean roubarObjetivo) {
        this.roubarObjetivo = roubarObjetivo;
    }
}
