import java.util.Scanner;

public class Main {
        static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcaoMenu;

        do{
            System.out.println("***********Menu Principal***********");
            System.out.println("1 escolher o boneco");
            System.out.println("2 Atacar com o boneco");
            System.out.println("3 sair");
            System.out.println("************************************");
            System.out.print("Escolha uma opção: ");

            opcaoMenu = scanner.nextInt();
            scanner.nextLine();



        }while (opcaoMenu != 3);



        suporte Senna = new suporte();

        Senna.setNome("Senna");
        Senna.setPell(true);

        System.out.println(Senna.getNome());

        Senna.ataqueBasico();
        Senna.ataqueBasico(true);
        Senna.acoes(true, false);



    }
    public void menuBonecos(){
        int opcao;

        System.out.println("************ Escolher o Boneco ************");
        System.out.println("************  ************");
    }
}

