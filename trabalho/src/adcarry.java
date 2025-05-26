public class adcarry extends boneco{
    int critico;


    @Override
    public void ataqueBasico() {
        System.out.println("toma hit dolorido");
    }

    public void ataqueBasico(int critico) {
       if (critico > 2){
            System.out.println("Toma hit critico!!!");
       }
    }
}
