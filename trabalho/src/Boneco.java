public abstract class Boneco {
    protected String nome;
    protected String raca;
    protected String roule;
    protected String arma;
    protected int nivel;

    public Boneco(String nome, String raca, String roule, String arma, int nivel){
        this.nome = nome;
        this.arma = arma;
        this.nivel = nivel;
        this.raca = raca;
        this.roule = roule;
    }

    public abstract void mostrarStatus();

    public abstract void ataqueBasico();

    public abstract void retornarBase();

    public abstract void farmarGold();

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getRoule() {
        return roule;
    }

    public void setRoule(String roule) {
        this.roule = roule;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
