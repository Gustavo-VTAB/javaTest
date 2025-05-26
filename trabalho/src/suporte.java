public class suporte extends boneco{
    private boolean pell;
    private boolean stun;

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

    @Override
    public void ataqueBasico() {
        System.out.println("toma ataque fraco");
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
}
