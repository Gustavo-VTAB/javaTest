public class boneco {
    private String nome;
    private String roule;
    private String raca;

    public void ataqueBasico(){
        System.out.println("toma hit!!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
}
